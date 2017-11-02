package com.cjg.pay.web;

import com.cjg.common.dto.Order;
import com.cjg.common.dto.Page;
import com.cjg.common.dto.Result;
import com.cjg.pay.pojo.RpTradePaymentOrder;
import com.cjg.pay.pojo.RpTradePaymentRecord;
import com.cjg.pay.pojo.vo.AccountInfoQuery;
import com.cjg.pay.pojo.vo.UserInfoQuery;
import com.cjg.pay.serviceMerchar.AccountService;
import com.cjg.pay.serviceMerchar.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TradePayAction {
    @Autowired
    private TradeService tradeService;

    @ResponseBody
    @RequestMapping("/TradeList")
    public Result<RpTradePaymentRecord> RpTradePaymentOrder(Page page, Order order, UserInfoQuery query){
        System.out.println(page);
        return  tradeService.listItemsByPage(page,order,query);
    }

}
