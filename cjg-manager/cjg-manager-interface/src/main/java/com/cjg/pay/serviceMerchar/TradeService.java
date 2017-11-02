package com.cjg.pay.serviceMerchar;

import com.cjg.common.dto.Order;
import com.cjg.common.dto.Page;
import com.cjg.common.dto.Result;
import com.cjg.pay.pojo.RpTradePaymentOrder;
import com.cjg.pay.pojo.RpTradePaymentRecord;
import com.cjg.pay.pojo.vo.UserInfoQuery;

public interface TradeService {
    Result<RpTradePaymentRecord> listItemsByPage(Page page, Order order, UserInfoQuery query);

}
