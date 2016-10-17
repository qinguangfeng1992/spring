package com.qinguangfeng.control;

import com.fc.platform.commons.page.Page;
import com.qinguangfeng.dao.entity.News;
import com.qinguangfeng.dao.entity.Topic;
import com.qinguangfeng.services.LogicTopic;
import com.qinguangfeng.services.NewsLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by Administrator on 2016/9/27.
 */
@Controller
public class contro {
    public contro() {
        System.out.println("我要在页面输出Json,这是控制器的初始化！");
    }

    @Autowired
    private LogicTopic logic;
    @Autowired
    private NewsLogic newsLogic;

    @RequestMapping("/topiclist")
    @ResponseBody
    public Object getTopList() {
        return logic.findAll();

    }

 /*   @RequestMapping("/topicindex")
     public String getTopIndex(ModelMap modelMap){
       List<Topic> list= logic.findAll();
        modelMap.put("list",list);
        return "index";

    }*/
//主页
    @RequestMapping("/topicindex")
    public String getTopIndex(@RequestParam(name = "page", defaultValue = "0") Integer page, ModelMap modelMap) {
        if (page < 0) page = 0;


        Page<Topic> list = logic.findPage(page, 2);
        modelMap.put("list", list);
        modelMap.put("currpage", page);
        return "index";

    }

//增加
    @RequestMapping("/addtopic")
    @ResponseBody
    public boolean getAddTop(Topic topic) {
        boolean bool = logic.addTop(topic);
        return bool;

    }

    @RequestMapping("/addtopicindex")
    public String getAddTopIndex(Topic topic) {

        return "zengjia";

    }

    //删除
    @RequestMapping("/deletop")
    @ResponseBody
    public int deleTopic(@RequestParam("tid") Integer tid) {
        try {
            int num = logic.deleTop(tid);
            return num;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

    //编辑

    @RequestMapping("/edittop")
    public String editTop(@RequestParam("tid") Integer tid, ModelMap modelMap) {
        Topic topic = logic.findTopAll(tid);
        modelMap.put("topic", topic);
        return "bianji";
    }

    @RequestMapping("/doedittop")
    @ResponseBody
    public int doEditTop(Topic topic) {
        int num = logic.updateTo(topic);
        return num;
    }

    //两个表连接
    @RequestMapping("/addtopic")
    @ResponseBody
    public String fingTwo(ModelMap modelMap) {


       List<News> list=newsLogic.findNewsAll();
        modelMap.put("nlist",list);
        return "zengjia";

    }
}
