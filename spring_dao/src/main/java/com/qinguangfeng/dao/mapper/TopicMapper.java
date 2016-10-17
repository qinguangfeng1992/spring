package com.qinguangfeng.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.qinguangfeng.dao.entity.Topic;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface TopicMapper {

	void insertTopic(Topic topic);

	int deleteTopicByTid(Integer tid);

	int updateTopic(Topic topic);

	Page<Topic> searchTopicByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Topic> searchTopicByParams(@Param("map") Map<String, String> map);

} 
