package com.cjg.pay.web;

import com.cjg.pay.serviceMerchar.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexAction {



    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/index")
    public String index2(){
        return "index";
    }

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        System.out.println(page);
        return page;
    }
}
