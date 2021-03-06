package yycg.business.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yycg.base.pojo.po.Dictinfo;
import yycg.base.pojo.vo.ActiveUser;
import yycg.base.pojo.vo.PageQuery;
import yycg.base.process.context.Config;
import yycg.base.process.result.DataGridResultInfo;
import yycg.base.process.result.ExceptionResultInfo;
import yycg.base.process.result.ResultInfo;
import yycg.base.process.result.ResultUtil;
import yycg.base.process.result.SubmitResultInfo;
import yycg.base.service.SystemConfigService;
import yycg.business.pojo.vo.GysypmlCustom;
import yycg.business.pojo.vo.GysypmlQueryVo;
import yycg.business.pojo.vo.YpxxCustom;
import yycg.business.service.YpmlService;

/**
 * 
 * <p>
 * Title: YpmlAction
 * </p>
 * <p>
 * Description:供货商药品目录
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 苗润土
 * @date 2014年11月30日下午4:20:42
 * @version 1.0
 */
@Controller
@RequestMapping("/ypml")
public class YpmlAction {

	@Autowired
	private SystemConfigService systemConfigService;

	@Autowired
	private YpmlService ypmlService;

	// 查询页面
	@RequestMapping("/querygysypml")
	public String querygysypml(Model model) throws Exception {
		// 药品类别
		List<Dictinfo> yplblist = systemConfigService.findDictinfoByType("001");
		model.addAttribute("yplblist", yplblist);
		// 交易状态
		List<Dictinfo> jyztlist = systemConfigService.findDictinfoByType("003");
		model.addAttribute("jyztlist", jyztlist);
		// 质量层次
		List<Dictinfo> zlcclist = systemConfigService.findDictinfoByType("004");
		model.addAttribute("zlcclist", zlcclist);
		// 供货状态
		List<Dictinfo> controllist = systemConfigService.findDictinfoByType("008");
		model.addAttribute("controllist", controllist);

		return "/business/ypml/querygysypml";
	}

	// 查询列表结果集,json
	@RequestMapping("/querygysypml_result")
	public @ResponseBody DataGridResultInfo querygysypml_result(
			HttpSession session,
			GysypmlQueryVo gysypmlQueryVo,// 查询条件
			int page, int rows) throws Exception {

		// 当前用户
		ActiveUser activeUser = (ActiveUser) session
				.getAttribute(Config.ACTIVEUSER_KEY);
		// 用户所属的单位
		String usergysid = activeUser.getSysid();// 单位id

		// 列表的总数
		int total = ypmlService.findGysypmlCount(usergysid, gysypmlQueryVo);

		// 分页参数
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		gysypmlQueryVo.setPageQuery(pageQuery);// 设置分页参数

		// 分页查询列表
		List<GysypmlCustom> list = ypmlService.findGysypmlList(usergysid,gysypmlQueryVo);

		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);

		return dataGridResultInfo;
	}

	// 查询页面
	@RequestMapping("/queryaddgysypml")
	public String queryaddgysypml(Model model) throws Exception {
		// 药品类别
		List<Dictinfo> yplblist = systemConfigService.findDictinfoByType("001");
		model.addAttribute("yplblist", yplblist);
		// 交易状态
		List<Dictinfo> jyztlist = systemConfigService.findDictinfoByType("003");
		model.addAttribute("jyztlist", jyztlist);
		// 质量层次
		List<Dictinfo> zlcclist = systemConfigService.findDictinfoByType("004");
		model.addAttribute("zlcclist", zlcclist);

		return "/business/ypml/queryaddgysypml";
	}

	// 查询列表结果集,json
	@RequestMapping("/queryaddgysypml_result")
	public @ResponseBody
	DataGridResultInfo queryaddgysypml_result(HttpSession session,
			GysypmlQueryVo gysypmlQueryVo,// 查询条件
			int page, int rows) throws Exception {

		// 当前用户
		ActiveUser activeUser = (ActiveUser) session
				.getAttribute(Config.ACTIVEUSER_KEY);
		// 用户所属的单位
		String usergysid = activeUser.getSysid();// 单位id

		// 列表的总数
		int total = ypmlService.findAddGysypmlCount(usergysid, gysypmlQueryVo);

		// 分页参数
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		gysypmlQueryVo.setPageQuery(pageQuery);// 设置分页参数

		// 分页查询列表
		List<GysypmlCustom> list = ypmlService.findAddGysypmlList(usergysid,
				gysypmlQueryVo);

		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);

		return dataGridResultInfo;
	}
	
	
	//供货商药品目录添加提交
	@RequestMapping("/addgysypmlsubmit")
	public @ResponseBody SubmitResultInfo addgysypmlsubmit(
			HttpSession session,
			int[] indexs,//接收页面选中的行序号(多个)
			GysypmlQueryVo gysypmlQueryVo//页面提交的业务数据，保存在list中
			)throws Exception{
		
		ActiveUser activeUser = (ActiveUser)session.getAttribute(Config.ACTIVEUSER_KEY);
		//当前用户所属单位 即供货商的id
		String usergysid = activeUser.getSysid();
		
		//页面提交的业务数据（多个），要处理的业务数据，页面中传入的参数
		List<YpxxCustom> list = gysypmlQueryVo.getYpxxCustoms();
		
		//处理数据的总数
		int count = indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			
			ResultInfo resultInfo = null;
			
			//根据选中行的序号获取要处理的业务数据(单个)
			YpxxCustom ypxxCustom =  list.get(indexs[i]);
			String ypxxid = ypxxCustom.getId();//页面中传入的参数
			
			try {
				ypmlService.insertGysypml(usergysid, ypxxid);
			} catch (Exception e) {
				e.printStackTrace();
				
				//进行异常解析
				if(e instanceof ExceptionResultInfo){
					resultInfo = ((ExceptionResultInfo)e).getResultInfo();
				}else{
					//构造未知错误异常
					resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
				}
				
				

			}
			if(resultInfo == null){
				//说明成功
				count_success++;
			}else{
				count_error++;
				//记录失败原因
				msgs_error.add(resultInfo);
			}
			

		}
		
		//提示用户成功数量、失败数量、失败原因
		
		/*return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 907, new Object[]{
				count_success,
				count_error
		}));*/
		//改成返回详细信息
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 907, new Object[]{
				count_success,
				count_error
		}), msgs_error);
		
	}
	
	//供货商药品目录删除
	@RequestMapping("/deletegysypmlsubmit")
	public @ResponseBody SubmitResultInfo gysypmldel(HttpSession session,
			int[] indexs,
			GysypmlQueryVo gysypmlQueryVo) throws Exception{
		//获取供应商用户Id
		ActiveUser activeUser = (ActiveUser) session.getAttribute(Config.ACTIVEUSER_KEY);
		String usergysid = activeUser.getSysid();
		
		//获取页面要提交的数据
		List<GysypmlCustom> gysypmlCustoms = gysypmlQueryVo.getGysypmlCustoms();
		
		//获取总条数
		int count = indexs.length;
		
		//记录成功条数
		int count_success = 0;
		
		//记录失败条数
		int count_failure = 0;
		
		//记录失败原因
		List<ResultInfo> msgs_errorInfos = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			//获取药品信息id
			String ypxxid = gysypmlCustoms.get(indexs[i]).getYpxxid();
			
			ResultInfo resultInfo = null;
			
			try{
				ypmlService.deleteGysypml(usergysid, ypxxid);
			}catch(Exception e){
				e.printStackTrace();
				if(e instanceof ExceptionResultInfo){
					resultInfo = ((ExceptionResultInfo)e).getResultInfo();
				}else{
					//构造未知错误异常
					resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
				}
			}
			
			if(resultInfo == null){
				count_success++;
			}else{
				count_failure++;
				msgs_errorInfos.add(resultInfo);
			}
		}
		return ResultUtil.createSubmitResult(
				ResultUtil.createSuccess(Config.MESSAGE,907,new Object[]{count_success,count_failure}),
				msgs_errorInfos);
	}
	
	//供应商药品目录供应状态查询
	@RequestMapping("/querygysypmlcontrol")
	public String querygysypmlcontrol(Model model) throws Exception {
		// 药品类别
		List<Dictinfo> yplblist = systemConfigService.findDictinfoByType("001");
		model.addAttribute("yplblist", yplblist);
		// 交易状态
		List<Dictinfo> jyztlist = systemConfigService.findDictinfoByType("003");
		model.addAttribute("jyztlist", jyztlist);
		// 质量层次
		List<Dictinfo> zlcclist = systemConfigService.findDictinfoByType("004");
		model.addAttribute("zlcclist", zlcclist);
		// 供货状态
		List<Dictinfo> controllist = systemConfigService.findDictinfoByType("008");
		model.addAttribute("controllist", controllist);

		return "/business/ypml/querygysypmlcontrol";
	}
	
	@RequestMapping("/querygysypmlcontrol_result")
	public @ResponseBody DataGridResultInfo querygysypmlcontrol_result(
			GysypmlQueryVo gysypmlQueryVo,//查询条件
			int page, int rows//分页信息
			) throws Exception {
		//查询总记录数
		int total = ypmlService.findGysypmlControlCount(gysypmlQueryVo);
		
		// 分页参数
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		gysypmlQueryVo.setPageQuery(pageQuery);// 设置分页参数

		// 分页查询列表
		List<GysypmlCustom> list = ypmlService.findGysypmlControlList(gysypmlQueryVo);

		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);

		return dataGridResultInfo;
	}
	
	//药品控制目录供货状态修改
	@RequestMapping("/gysypmlcontrolsubmit")
	public @ResponseBody SubmitResultInfo gysypmlcontrolsubmit(
			int[] indexs,
			GysypmlQueryVo gysypmlQueryVo) throws Exception{
		
		//获取页面要提交的数据
		List<GysypmlCustom> gysypmlCustoms = gysypmlQueryVo.getGysypmlCustoms();
		
		//获取总条数
		int count = indexs.length;
		
		//记录成功条数
		int count_success = 0;
		
		//记录失败条数
		int count_failure = 0;
		
		//记录失败原因
		List<ResultInfo> msgs_errorInfos = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			//获取药品控制目录id
			String gysypmlid = gysypmlCustoms.get(indexs[i]).getGysypmlid();
			
			//获取供货状态
			String control = gysypmlCustoms.get(indexs[i]).getControl();
			
			//获取备注信息
			String advice = gysypmlCustoms.get(indexs[i]).getAdvice();
			
			ResultInfo resultInfo = null;
			
			try{
				ypmlService.updateGysypmlControlByUsergysidAndYpxxid(gysypmlid, control,advice);
			}catch(Exception e){
				e.printStackTrace();
				if(e instanceof ExceptionResultInfo){
					resultInfo = ((ExceptionResultInfo)e).getResultInfo();
				}else{
					//构造未知错误异常
					resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
				}
			}
			
			if(resultInfo == null){
				count_success++;
			}else{
				count_failure++;
				msgs_errorInfos.add(resultInfo);
			}
		}
		return ResultUtil.createSubmitResult(
				ResultUtil.createSuccess(Config.MESSAGE,907,new Object[]{count_success,count_failure}),
				msgs_errorInfos);
	}
}
