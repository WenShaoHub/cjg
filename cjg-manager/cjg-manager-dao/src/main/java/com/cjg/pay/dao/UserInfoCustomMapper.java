package com.cjg.pay.dao;

import com.cjg.pay.pojo.RpUserInfo;

import java.util.List;
import java.util.Map;

public interface UserInfoCustomMapper {
    /**
     * 查询所有用户的总记录数
     *
     * @return
     */
    //  long countItems(Map<String,Object> map);
    long countUsers(Map<String, Object> map) ;

    /**
     * 分页查询出商品集合
     * @return
     */
  //  List<TbItemCustom> listItemsByPage(Map<String,Object> map);
    List<RpUserInfo> ListUserByPage(Map<String,Object> map);
}
