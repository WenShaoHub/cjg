package com.cjg.pay.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
public class IndexAction {

    @RequestMapping("/")
    public String userInfo(){
        return "index";
    }
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        System.out.println(page);
        return page;
    }

//    @RequestMapping("/userInfo")
//    public String page(){
//        System.out.println("userInfo");
//        return "userInfo";
//    }


}