package com.qinguangfeng.services;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.qinguangfeng.dao.entity.Topic;
import com.qinguangfeng.dao.mapper.TopicMapper;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/26.
 */
@Service
public class LogicTopic {
    public LogicTopic() {
        System.out.println("业务逻辑层的对象被创建了");
    }

    @Autowired
    private TopicMapper topicMapper;

    public List<Topic> findAll() {
        System.out.println("业务逻辑类的查找全部方法");
        //xml实现类里，判断条件是，如果什么都不传入，那就查询全部
        return topicMapper.searchTopicByParams(null);

    }

    public Page<Topic> findPage(int page, int rowcount) {

        PageRequest pg = new PageRequest(page, rowcount);

        Page<Topic> data = topicMapper.searchTopicByParams(null, pg);

        return data;

    }

    //增加
    public boolean addTop(Topic topic) {

        try {
            topicMapper.insertTopic(topic);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    //删除

    public int deleTop(int tid) {
        int num = topicMapper.deleteTopicByTid(tid);

        return num;
    }
//编辑


    public Topic findTopAll(int tid) {

        Map p = new HashMap();
        p.put("tid", tid);

        List<Topic> list = topicMapper.searchTopicByParams(p);
        if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }


    }
    //执行编辑
    public int updateTo(Topic topic) {


        return  topicMapper.updateTopic(topic);
    }


}
