package com.cjg.pay.web;

import com.cjg.common.dto.Order;
import com.cjg.common.dto.Page;
import com.cjg.common.dto.Result;
import com.cjg.pay.pojo.RpUserInfo;
import com.cjg.pay.pojo.vo.UserInfoQuery;
import com.cjg.pay.serviceMerchar.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class AccountAction {
    @Autowired
    private AccountService accountService;



}
