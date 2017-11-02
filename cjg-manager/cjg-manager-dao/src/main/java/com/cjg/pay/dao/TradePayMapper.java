package com.cjg.pay.dao;

import com.cjg.pay.pojo.RpTradePaymentOrder;
import com.cjg.pay.pojo.RpTradePaymentRecord;
import com.cjg.pay.pojo.vo.AccountInfoQuery;

import java.util.List;
import java.util.Map;

public interface TradePayMapper {

     List<RpTradePaymentRecord> selectByMecharNo(Map<String, Object> map);

    long counts(Map<String, Object> map);
}
