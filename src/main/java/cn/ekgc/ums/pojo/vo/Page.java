package cn.ekgc.ums.pojo.vo;

import cn.ekgc.ums.util.ConstantUtils;

import java.io.Serializable;
import java.util.List;

/**
 * <b>分页类</b>
 * @param <E>
 */
public class Page<E> implements Serializable {

	private static final long serialVersionUID = 816147114435716388L;
	private Integer pagenum;    //每页码数
	private Integer pagesize;   //每页条数
	private Integer draw;       //dataTable的分页信息值
	private List<E> list;        //每页集合
	private Long totalCount;    //总条数
	private Integer totalPage;  //总页数

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public Page(){

	}
	public Page(Integer pagenum,Integer pagesize){
		if(pagenum>0&&pagenum!=null){
			this.pagenum=pagenum;
		}else{
			pagenum= ConstantUtils.PAGE_NUM;
		}
		if(pagesize>0&&pagesize!=null){
			this.pagesize=pagesize;
		}else {
			pagesize=ConstantUtils.PAGE_SIZE;
		}

	}

	public Page(Integer pagenum,Integer pagesize,Integer draw){
		if(pagenum!=null&&pagenum>0){
			this.pagenum=pagenum;
		}else{
			this.pagenum= ConstantUtils.PAGE_NUM;
		}
		if(pagesize!=null&&pagesize>0){
			this.pagesize=pagesize;
		}else {
			this.pagesize=ConstantUtils.PAGE_SIZE;
		}
		this.draw=draw;
	}

	public Integer getPagenum() {
		return pagenum;
	}

	public void setPagenum(Integer pagenum) {
		this.pagenum = pagenum;
	}

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

	public List < E > getList() {
		return list;
	}

	public void setList(List < E > list) {
		this.list = list;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}
