package com.qinguangfeng.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.qinguangfeng.dao.entity.Newuser;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface NewuserMapper {

	void insertNewuser(Newuser newuser);

	void deleteNewuserByUsid(Integer usid);

	void updateNewuser(Newuser newuser);

	Page<Newuser> searchNewuserByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Newuser> searchNewuserByParams(@Param("map") Map<String, String> map);

} 
