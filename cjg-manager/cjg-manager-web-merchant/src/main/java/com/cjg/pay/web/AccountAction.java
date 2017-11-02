package com.cjg.pay.web;

import com.cjg.common.dto.Order;
import com.cjg.common.dto.Page;
import com.cjg.common.dto.Result;
import com.cjg.pay.pojo.RpUserInfo;
import com.cjg.pay.pojo.vo.AccountInfoQuery;
import com.cjg.pay.pojo.vo.UserInfoQuery;
import com.cjg.pay.serviceMerchar.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
public class AccountAction {

    @Autowired
    private AccountService accountService;


    @ResponseBody
    @RequestMapping("/userInfoList")
    public Result<AccountInfoQuery> userInfoList(Page page, Order order, UserInfoQuery query){
        System.out.println(page);
        return  accountService.listItemsByPage(page,order,query);
    }

}
