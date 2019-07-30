package cn.bao.mybatis.mapper;

import cn.bao.mybatis.pojo.Orders;
import cn.bao.mybatis.pojo.OrdersCustom;

import java.util.List;

public interface OrdersMapperCustom {
    List<OrdersCustom> findOrdersUser() throws Exception;
    List<Orders> findOrdersUserResultMap() throws  Exception;
    List<Orders> findOrdersUserAndDetailResultMap() throws  Exception;
}
