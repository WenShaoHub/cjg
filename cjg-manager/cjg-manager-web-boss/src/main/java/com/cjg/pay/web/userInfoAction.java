package com.cjg.pay.web;

import com.cjg.common.dto.Order;
import com.cjg.common.dto.Page;
import com.cjg.common.dto.Result;
import com.cjg.pay.pojo.RpUserInfo;
import com.cjg.pay.pojo.vo.UserInfoQuery;
import com.cjg.pay.serviceBoss.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Scope("prototype")
public class userInfoAction {

    @Autowired
    private UserInfoService userInfoService;


    @ResponseBody
    @RequestMapping("/userInfoList")
    public Result<RpUserInfo> userInfoList(Page page, Order order, UserInfoQuery query){
        return  userInfoService.listItemsByPage(page,order,query);
    }
}
