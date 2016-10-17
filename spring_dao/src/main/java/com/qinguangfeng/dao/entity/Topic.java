package com.qinguangfeng.dao.entity;

/**
 * 
 * @author qinguangfeng
 */
public class Topic {
	/**
	 *  主题ID
	 */
	private Integer tid;
	/**
	 *  新闻主题名称
	 */
	private String tname;
	/**
	 *  
	 */
	private Integer tlogic;
	/**
	 * 主题ID
	 * @param tid
	 */
	public void setTid(Integer tid){
		this.tid = tid;
	}
	
    /**
     * 主题ID
     * @return
     */	
    public Integer getTid(){
    	return tid;
    }
	/**
	 * 新闻主题名称
	 * @param tname
	 */
	public void setTname(String tname){
		this.tname = tname;
	}
	
    /**
     * 新闻主题名称
     * @return
     */	
    public String getTname(){
    	return tname;
    }
	/**
	 * 
	 * @param tlogic
	 */
	public void setTlogic(Integer tlogic){
		this.tlogic = tlogic;
	}
	
    /**
     * 
     * @return
     */	
    public Integer getTlogic(){
    	return tlogic;
    }
}