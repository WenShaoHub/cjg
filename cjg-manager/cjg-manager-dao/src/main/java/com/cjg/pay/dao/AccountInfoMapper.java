package com.cjg.pay.dao;

import com.cjg.pay.pojo.vo.AccountInfoQuery;

import java.util.List;
import java.util.Map;

public interface AccountInfoMapper {

     List<AccountInfoQuery> selectByUserNo(Map<String, Object> map);

    long countUsers(Map<String, Object> map);
}
