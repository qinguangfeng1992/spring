package com.qinguangfeng.services;

import com.qinguangfeng.dao.entity.News;

import java.util.List;

/**
 * Created by Administrator on 2016/9/29.
 */
public interface NewsLogic {

    public List<News> findNewsAll();
}
