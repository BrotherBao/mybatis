package cn.bao.mybatis.mapper;

import cn.bao.mybatis.pojo.Orders;
import cn.bao.mybatis.pojo.OrdersCustom;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OrdersCustomImp implements OrdersMapperCustom{
    private OrdersMapperCustom orderCustomMapper;

    public OrdersCustomImp() throws IOException {
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        orderCustomMapper = sqlSession.getMapper(OrdersMapperCustom.class);
    }

    @Override
    public List<OrdersCustom> findOrdersUser() throws Exception {
        return orderCustomMapper.findOrdersUser();
    }

    @Override
    public List<Orders> findOrdersUserResultMap() throws Exception {
        return orderCustomMapper.findOrdersUserResultMap();
    }

    @Override
    public List<Orders> findOrdersUserAndDetailResultMap() throws Exception {
        return orderCustomMapper.findOrdersUserAndDetailResultMap();
    }
}
