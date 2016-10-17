package com.qinguangfeng.dao.entity;

/**
 * 
 * @author qinguangfeng
 */
public class Newuser {
	/**
	 *  用户的ID，是主键
	 */
	private Integer usid;
	/**
	 *  用户姓名
	 */
	private String uname;
	/**
	 *  用户密码
	 */
	private String upwd;
	/**
	 * 用户的ID，是主键
	 * @param usid
	 */
	public void setUsid(Integer usid){
		this.usid = usid;
	}
	
    /**
     * 用户的ID，是主键
     * @return
     */	
    public Integer getUsid(){
    	return usid;
    }
	/**
	 * 用户姓名
	 * @param uname
	 */
	public void setUname(String uname){
		this.uname = uname;
	}
	
    /**
     * 用户姓名
     * @return
     */	
    public String getUname(){
    	return uname;
    }
	/**
	 * 用户密码
	 * @param upwd
	 */
	public void setUpwd(String upwd){
		this.upwd = upwd;
	}
	
    /**
     * 用户密码
     * @return
     */	
    public String getUpwd(){
    	return upwd;
    }
}