package com.cjg.pay.serviceBoss;

import com.cjg.common.dto.Order;
import com.cjg.common.dto.Page;
import com.cjg.common.dto.Result;
import com.cjg.pay.pojo.RpUserInfo;
import com.cjg.pay.pojo.vo.UserInfoQuery;

import java.util.List;

public interface UserInfoService {
    public List<RpUserInfo> findUserInfo();

    Result<RpUserInfo> listItemsByPage(Page page, Order order, UserInfoQuery query);

}
