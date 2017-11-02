package com.cjg.pay.serviceMarchar.impl;

import com.cjg.common.dto.Order;
import com.cjg.common.dto.Page;
import com.cjg.common.dto.Result;
import com.cjg.pay.dao.AccountInfoMapper;
import com.cjg.pay.pojo.RpUserInfo;
import com.cjg.pay.pojo.vo.AccountInfoQuery;
import com.cjg.pay.pojo.vo.UserInfoQuery;
import com.cjg.pay.serviceMerchar.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccounntServiceImpl implements AccountService {

    @Autowired
    private AccountInfoMapper accountInfoDao;

    @Override
    public Result<AccountInfoQuery> listItemsByPage(Page page, Order order, UserInfoQuery query) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("page", page);
        map.put("order", order);
        map.put("query",query);

        //通过itemDaoCustom查询出total，查询所有商品数量，没有附加条件
        long total = accountInfoDao.countUsers(map) ;
        List<AccountInfoQuery> rows = accountInfoDao.selectByUserNo(map);

        //通过userCustomDao查询出rows
        Result<AccountInfoQuery> rs = new Result<AccountInfoQuery>();
        rs.setTotal(total);
        rs.setRows(rows);
        return rs;


    }
}
