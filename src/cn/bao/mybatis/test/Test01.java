package cn.bao.mybatis.test;

import cn.bao.mybatis.mapper.OrdersCustomImp;
import cn.bao.mybatis.pojo.Orders;
import cn.bao.mybatis.pojo.OrdersCustom;
import org.junit.Test;

import java.util.List;

public class Test01 {
    @Test
    public void testFindOrdersUser() throws Exception {
        OrdersCustomImp ordersCustomImp = new OrdersCustomImp();
        List<OrdersCustom> ordersCustomList = ordersCustomImp.findOrdersUser();
        System.out.println(ordersCustomList);
    }
    @Test
    public void testFindOrdersUserResultMap() throws Exception {
        OrdersCustomImp ordersCustomImp = new OrdersCustomImp();
        List<Orders> ordersCustomList = ordersCustomImp.findOrdersUserResultMap();
        System.out.println(ordersCustomList);
    }
    @Test
    public void testFindOrdersUserAndDetailResultMap() throws Exception {
        OrdersCustomImp ordersCustomImp = new OrdersCustomImp();
        List<Orders> ordersUserAndDetailResultMap = ordersCustomImp.findOrdersUserAndDetailResultMap();
        System.out.println(ordersUserAndDetailResultMap);
    }


}
