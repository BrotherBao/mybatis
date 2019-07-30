package cn.bao.mybatis.first;

import cn.bao.mybatis.entity.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisFirst {
    @Test
    public void findByBidTest() throws IOException {
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂，传入mybatis配置文件信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Book book = sqlSession.selectOne("test.findBookByBid","1");
        System.out.println(book);
        sqlSession.close();

    }
    @Test
    public void findBookByName() throws IOException {
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Book> list = sqlSession.selectList("test.findBookByName","孙");
        System.out.println(list);
        sqlSession.close();
    }

    @Test
    public void insertBook() throws IOException {
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession =  sqlSessionFactory.openSession();
        Book book = new Book();
        book.setBid("10");
        book.setBname("图书");
        book.setPrice(21.6);
        book.setAuthor("宝");
        book.setImage("book_img/22788312-1_l.jpg");
        book.setCid("1");
        sqlSession.insert("test.insertBook",book);
        sqlSession.commit();
        sqlSession.close();
    }


}
