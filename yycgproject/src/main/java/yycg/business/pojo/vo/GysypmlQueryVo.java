package yycg.business.pojo.vo;

import java.util.List;

import yycg.base.pojo.po.Usergys;
import yycg.base.pojo.vo.PageQuery;

public class GysypmlQueryVo {
	
	//供应商信息
	private Usergys usergys;
	
	//添加页面批量提交 
	private List<YpxxCustom> ypxxCustoms;
	
	//添加页面批量提交供应商药品目录删除
	private List<GysypmlCustom> gysypmlCustoms;

	private PageQuery pageQuery;
	
	private YpxxCustom ypxxCustom;
	
	private GysypmlCustom gysypmlCustom;
	
	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public GysypmlCustom getGysypmlCustom() {
		return gysypmlCustom;
	}

	public void setGysypmlCustom(GysypmlCustom gysypmlCustom) {
		this.gysypmlCustom = gysypmlCustom;
	}

	public YpxxCustom getYpxxCustom() {
		return ypxxCustom;
	}

	public void setYpxxCustom(YpxxCustom ypxxCustom) {
		this.ypxxCustom = ypxxCustom;
	}

	public List<YpxxCustom> getYpxxCustoms() {
		return ypxxCustoms;
	}

	public void setYpxxCustoms(List<YpxxCustom> ypxxCustoms) {
		this.ypxxCustoms = ypxxCustoms;
	}
	
	public List<GysypmlCustom> getGysypmlCustoms() {
		return gysypmlCustoms;
	}

	public void setGysypmlCustoms(List<GysypmlCustom> gysypmlCustoms) {
		this.gysypmlCustoms = gysypmlCustoms;
	}

	public Usergys getUsergys() {
		return usergys;
	}

	public void setUsergys(Usergys usergys) {
		this.usergys = usergys;
	}

}
