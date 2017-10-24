package com.cjg.pay.serviceBoss.impl;

import com.cjg.common.dto.Order;
import com.cjg.common.dto.Page;
import com.cjg.common.dto.Result;
import com.cjg.pay.dao.RpUserInfoMapper;
import com.cjg.pay.dao.UserInfoCustomMapper;
import com.cjg.pay.pojo.RpUserInfo;
import com.cjg.pay.pojo.vo.UserInfoQuery;
import com.cjg.pay.serviceBoss.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private RpUserInfoMapper userDao;
    @Autowired
    private UserInfoCustomMapper userCustomDao;

    @Override
    public List<RpUserInfo> findUserInfo() {
        return null;
    }

    @Override
    public Result<RpUserInfo> listItemsByPage(Page page, Order order, UserInfoQuery query) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("page", page);
        map.put("order", order);
        map.put("query",query);

        //通过itemDaoCustom查询出total，查询所有商品数量，没有附加条件
        long total = userCustomDao.countUsers(map) ;
        List<RpUserInfo> rows = userCustomDao.ListUserByPage(map);

        //通过userCustomDao查询出rows
        Result<RpUserInfo> rs = new Result<RpUserInfo>();
        rs.setTotal(total);
        rs.setRows(rows);
        return rs;
    }
}
