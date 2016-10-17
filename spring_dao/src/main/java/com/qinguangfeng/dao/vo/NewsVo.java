package com.qinguangfeng.dao.vo;

/**
 * 
 * @author qinguangfeng
 */
public class NewsVo {
	/**
	 *  新闻的ID编号
	 */
	private Integer nid;
	/**
	 *  外键。引用新闻主题表
	 */
	private Integer ntid;
	/**
	 *  新闻标题
	 */
	private String ntitle;
	/**
	 *  新闻的作者
	 */
	private String nauthor;
	/**
	 *  新闻创建时间
	 */
	private String ncreatedate;
	/**
	 *  新闻的内容
	 */
	private String ncontent;
	/**
	 *  新闻修改时间
	 */
	private String nmodifydate;
	/**
	 *  新闻摘要
	 */
	private String nsummary;
	/**
	 * 新闻的ID编号
	 * @param nid
	 */
	public void setNid(Integer nid){
		this.nid = nid;
	}
	
    /**
     * 新闻的ID编号
     * @return
     */	
    public Integer getNid(){
    	return nid;
    }
	/**
	 * 外键。引用新闻主题表
	 * @param ntid
	 */
	public void setNtid(Integer ntid){
		this.ntid = ntid;
	}
	
    /**
     * 外键。引用新闻主题表
     * @return
     */	
    public Integer getNtid(){
    	return ntid;
    }
	/**
	 * 新闻标题
	 * @param ntitle
	 */
	public void setNtitle(String ntitle){
		this.ntitle = ntitle;
	}
	
    /**
     * 新闻标题
     * @return
     */	
    public String getNtitle(){
    	return ntitle;
    }
	/**
	 * 新闻的作者
	 * @param nauthor
	 */
	public void setNauthor(String nauthor){
		this.nauthor = nauthor;
	}
	
    /**
     * 新闻的作者
     * @return
     */	
    public String getNauthor(){
    	return nauthor;
    }
	/**
	 * 新闻创建时间
	 * @param ncreatedate
	 */
	public void setNcreatedate(String ncreatedate){
		this.ncreatedate = ncreatedate;
	}
	
    /**
     * 新闻创建时间
     * @return
     */	
    public String getNcreatedate(){
    	return ncreatedate;
    }
	/**
	 * 新闻的内容
	 * @param ncontent
	 */
	public void setNcontent(String ncontent){
		this.ncontent = ncontent;
	}
	
    /**
     * 新闻的内容
     * @return
     */	
    public String getNcontent(){
    	return ncontent;
    }
	/**
	 * 新闻修改时间
	 * @param nmodifydate
	 */
	public void setNmodifydate(String nmodifydate){
		this.nmodifydate = nmodifydate;
	}
	
    /**
     * 新闻修改时间
     * @return
     */	
    public String getNmodifydate(){
    	return nmodifydate;
    }
	/**
	 * 新闻摘要
	 * @param nsummary
	 */
	public void setNsummary(String nsummary){
		this.nsummary = nsummary;
	}
	
    /**
     * 新闻摘要
     * @return
     */	
    public String getNsummary(){
    	return nsummary;
    }
}