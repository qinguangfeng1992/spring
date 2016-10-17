package com.qinguangfeng.services.impl;

import com.qinguangfeng.dao.entity.News;
import com.qinguangfeng.dao.mapper.NewsMapper;
import com.qinguangfeng.services.NewsLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/9/29.
 */
@Service
public class NewsLogImp implements NewsLogic {
    @Autowired
    private NewsMapper newsMapper;
    @Override
    public List<News> findNewsAll() {
        return newsMapper.searchNewByParams(null);
    }
}
