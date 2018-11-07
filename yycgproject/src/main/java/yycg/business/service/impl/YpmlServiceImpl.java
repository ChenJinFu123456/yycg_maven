package yycg.business.service.impl;

import java.util.List;

import org.aspectj.weaver.ast.And;
import org.springframework.beans.factory.annotation.Autowired;

import yycg.base.pojo.po.BasicinfoExample.Criteria;
import yycg.base.process.context.Config;
import yycg.base.process.result.ResultUtil;
import yycg.base.service.SystemConfigService;
import yycg.business.dao.mapper.GysypmlControlMapper;
import yycg.business.dao.mapper.GysypmlMapper;
import yycg.business.dao.mapper.GysypmlMapperCustom;
import yycg.business.dao.mapper.YpxxMapper;
import yycg.business.pojo.po.Gysypml;
import yycg.business.pojo.po.GysypmlControl;
import yycg.business.pojo.po.GysypmlControlExample;
import yycg.business.pojo.po.GysypmlExample;
import yycg.business.pojo.po.Ypxx;
import yycg.business.pojo.vo.GysypmlCustom;
import yycg.business.pojo.vo.GysypmlQueryVo;
import yycg.business.service.YpmlService;
import yycg.util.UUIDBuild;

public class YpmlServiceImpl implements YpmlService {

	@Autowired
	private GysypmlMapperCustom gysypmlMapperCustom;

	@Autowired
	private GysypmlMapper gysypmlMapper;
	
	@Autowired
	private GysypmlControlMapper gysypmlControlMapper;

	@Autowired
	private YpxxMapper ypxxMapper;
	
	@Autowired
	private SystemConfigService systemConfigService;

	@Override
	public List<GysypmlCustom> findGysypmlList(String usergysId,
			GysypmlQueryVo gysypmlQueryVo) throws Exception {
		// 非空判断
		gysypmlQueryVo = gysypmlQueryVo != null ? gysypmlQueryVo
				: new GysypmlQueryVo();

		GysypmlCustom gysypmlCustom = gysypmlQueryVo.getGysypmlCustom();
		if (gysypmlCustom == null) {
			gysypmlCustom = new GysypmlCustom();
		}

		// 设置供货商id
		gysypmlCustom.setUsergysid(usergysId);

		gysypmlQueryVo.setGysypmlCustom(gysypmlCustom);

		return gysypmlMapperCustom.findGysypmlList(gysypmlQueryVo);
	}

	@Override
	public int findGysypmlCount(String usergysId, GysypmlQueryVo gysypmlQueryVo)
			throws Exception {
		// 非空判断
		gysypmlQueryVo = gysypmlQueryVo != null ? gysypmlQueryVo
				: new GysypmlQueryVo();

		GysypmlCustom gysypmlCustom = gysypmlQueryVo.getGysypmlCustom();
		if (gysypmlCustom == null) {
			gysypmlCustom = new GysypmlCustom();
		}

		// 设置供货商id
		gysypmlCustom.setUsergysid(usergysId);

		gysypmlQueryVo.setGysypmlCustom(gysypmlCustom);
		return gysypmlMapperCustom.findGysypmlCount(gysypmlQueryVo);
	}

	@Override
	public List<GysypmlCustom> findAddGysypmlList(String usergysId,
			GysypmlQueryVo gysypmlQueryVo) throws Exception {
		// 非空判断
		gysypmlQueryVo = gysypmlQueryVo != null ? gysypmlQueryVo
				: new GysypmlQueryVo();

		GysypmlCustom gysypmlCustom = gysypmlQueryVo.getGysypmlCustom();
		if (gysypmlCustom == null) {
			gysypmlCustom = new GysypmlCustom();
		}

		// 设置供货商id
		gysypmlCustom.setUsergysid(usergysId);

		gysypmlQueryVo.setGysypmlCustom(gysypmlCustom);
		return gysypmlMapperCustom.findAddGysypmlList(gysypmlQueryVo);
	}

	@Override
	public int findAddGysypmlCount(String usergysId,
			GysypmlQueryVo gysypmlQueryVo) throws Exception {
		// 非空判断
		gysypmlQueryVo = gysypmlQueryVo != null ? gysypmlQueryVo
				: new GysypmlQueryVo();

		GysypmlCustom gysypmlCustom = gysypmlQueryVo.getGysypmlCustom();
		if (gysypmlCustom == null) {
			gysypmlCustom = new GysypmlCustom();
		}

		// 设置供货商id
		gysypmlCustom.setUsergysid(usergysId);

		gysypmlQueryVo.setGysypmlCustom(gysypmlCustom);
		return gysypmlMapperCustom.findAddGysypmlCount(gysypmlQueryVo);
	}

	// 根据供货商id和药品id查询供货商药品目录
	public Gysypml findGysypmlByUsergysidAndYpxxid(String usergysid,
			String ypxxid) throws Exception {
		GysypmlExample gysypmlExample = new GysypmlExample();
		GysypmlExample.Criteria criteria = gysypmlExample.createCriteria();
		// 设置查询条件
		criteria.andUsergysidEqualTo(usergysid);
		criteria.andYpxxidEqualTo(ypxxid);

		List<Gysypml> list = gysypmlMapper.selectByExample(gysypmlExample);
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;

	}

	// 根据供货商id和药品id查询供货商药品目录控制表记录
	public GysypmlControl findGysypmlControlByUsergysidAndYpxxid(String usergysid,
			String ypxxid) throws Exception {
		GysypmlControlExample gysypmlControlExample = new GysypmlControlExample();
		GysypmlControlExample.Criteria criteria = gysypmlControlExample.createCriteria();
		// 设置查询条件
		criteria.andUsergysidEqualTo(usergysid);
		criteria.andYpxxidEqualTo(ypxxid);

		List<GysypmlControl> list = gysypmlControlMapper.selectByExample(gysypmlControlExample);
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;

	}

	@Override
	public void insertGysypml(String usergysid, String ypxxid) throws Exception {

		// 只允许添加供货商药品目录中没有的药品
		// 校验方法：先根据供货商id和药品id查询供货商药品目录记录，如果查询到说明已存在
		Gysypml gysypml = this.findGysypmlByUsergysidAndYpxxid(usergysid,
				ypxxid);
		if (gysypml != null) {
			// 说明已存在
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 401,
					null));
		}

		// 药品的交易状态为暂停不允许添加
		// 根据药品id查询药品信息
		Ypxx ypxx = ypxxMapper.selectByPrimaryKey(ypxxid);
		if (ypxx == null) {
			// 系统中找不到系统信息
			// .....
		}
		// 药品交易状态
		String jyzt = ypxx.getJyzt();
		if (jyzt.equals("2")) {
			// 药品状态为暂停不允许添加
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 403,
					new Object[] { ypxx.getBm(), ypxx.getMc()

					}));
		}

		// 向供货商药品目录表gysypml插入一条记录
		Gysypml gysypml_insert = new Gysypml();
		gysypml_insert.setId(UUIDBuild.getUUID());
		gysypml_insert.setUsergysid(usergysid);
		gysypml_insert.setYpxxid(ypxxid);
		gysypmlMapper.insert(gysypml_insert);

		// 同时向供货商药品目录控制表gysypml_control插入一条记录
		// 如果控制表已存在供货商药品不用插入
		// 根据供货商id和药品id查询
		GysypmlControl gysypmlControl = this.findGysypmlControlByUsergysidAndYpxxid(usergysid, ypxxid);
		if(gysypmlControl==null){
			
			//从系统参数配置表获取控制状态的默认值
			String control = systemConfigService.findBasicinfoById("00101").getValue();
			
			//执行插入
			GysypmlControl gysypmlControl_insert = new GysypmlControl();
			gysypmlControl_insert.setId(UUIDBuild.getUUID());
			gysypmlControl_insert.setUsergysid(usergysid);
			gysypmlControl_insert.setYpxxid(ypxxid);
			gysypmlControl_insert.setControl(control);//控制状态，采用默认值，默认值从系统参数配置表中获取
			
			gysypmlControlMapper.insert(gysypmlControl_insert);
		}

	}

	//删除供应商药品目录
	@Override
	public void deleteGysypml(String usergysid, String ypxxid) throws Exception {
		//查询供应商药品目录是否存在
		Gysypml gysypml = this.findGysypmlByUsergysidAndYpxxid(usergysid, ypxxid);
		if(gysypml == null){
			//药品目录不存在
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 402, null));
		}
		
		this.deleteGysypmlByUsergysidAndYpxxid(usergysid, ypxxid);
	}

	//根据供应商id和押品信息id删除供应商药品目录
	public void deleteGysypmlByUsergysidAndYpxxid(String usergysid,	String ypxxid) throws Exception {
		// TODO Auto-generated method stub
		GysypmlExample gysypmlExample = new GysypmlExample();
		GysypmlExample.Criteria criteria = gysypmlExample.createCriteria();
		//设置删除条件
		criteria.andUsergysidEqualTo(usergysid);
		criteria.andYpxxidEqualTo(ypxxid);
		int rows = gysypmlMapper.deleteByExample(gysypmlExample);
		if(rows != 1){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 402, null));
		}
	}

	//根据供应商id和药品信息id更新供应商药品目录控制表
	public void updateGysypmlControlByUsergysidAndYpxxid(String gysypmlcontrolid,String control,String advice) throws Exception {
		//根据主键查询该条记录是否存在
		GysypmlControl gysypmlControl = gysypmlControlMapper.selectByPrimaryKey(gysypmlcontrolid);
		if(gysypmlControl == null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 407, null));
		}
		//获取记录中的供货状态
		String control_row = gysypmlControl.getControl();
		//判断是否和更改的状态相同
		if(control_row != null && !control_row.equals(control)){
			gysypmlControl.setControl(control);
			gysypmlControl.setAdvice(advice);
			gysypmlControlMapper.updateByPrimaryKeySelective(gysypmlControl);
		}else{
			String usergysid = gysypmlControl.getUsergysid();
			String ypxxid = gysypmlControl.getYpxxid();
			String ghztmc = systemConfigService.findDictinfoByDictcode("008", control).getInfo();
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 408, new Object[]{usergysid,ypxxid,ghztmc}));
		}
		
	}

	//查询药品目录控制列表
	public List<GysypmlCustom> findGysypmlControlList(GysypmlQueryVo gysypmlQueryVo) throws Exception {
		// TODO Auto-generated method stub
		return gysypmlMapperCustom.findGysypmlControlList(gysypmlQueryVo);
	}

	//查询药品目录控制列表计数
	public int findGysypmlControlCount(GysypmlQueryVo gysypmlQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return gysypmlMapperCustom.findGysypmlControlCount(gysypmlQueryVo);
	}

}
