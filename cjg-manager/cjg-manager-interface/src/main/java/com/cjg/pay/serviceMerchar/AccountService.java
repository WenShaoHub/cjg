package com.cjg.pay.serviceMerchar;

import com.cjg.common.dto.Order;
import com.cjg.common.dto.Page;
import com.cjg.common.dto.Result;
import com.cjg.pay.pojo.vo.AccountInfoQuery;
import com.cjg.pay.pojo.vo.UserInfoQuery;

public interface AccountService {
    Result<AccountInfoQuery> listItemsByPage(Page page, Order order, UserInfoQuery query);
}
