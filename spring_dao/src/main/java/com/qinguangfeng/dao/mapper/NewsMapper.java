package com.qinguangfeng.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.qinguangfeng.dao.entity.News;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface NewsMapper {

	void insertNew(News news);

	void deleteNewByNid(Integer nid);

	void updateNew(News news);

	Page<News> searchNewByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<News> searchNewByParams(@Param("map") Map<String, String> map);

} 
