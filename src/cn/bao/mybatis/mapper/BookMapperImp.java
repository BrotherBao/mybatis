package cn.bao.mybatis.mapper;

import cn.bao.mybatis.entity.Book;
import cn.bao.mybatis.entity.BookCostom;
import cn.bao.mybatis.entity.BookQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BookMapperImp implements BookMapper {


    private BookMapper bookMapper;

    public BookMapperImp() throws IOException {
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);
    }

    @Override
    public Book findBookByIdResultMap(String bid) throws Exception {
        return bookMapper.findBookByIdResultMap(bid);
    }

    @Override
    public Integer findBookCount(BookQueryVo bookQueryVo) throws Exception {
        return bookMapper.findBookCount(bookQueryVo);
    }

    @Override
    public List<BookCostom> findBookList(BookQueryVo bookQueryVo) throws Exception {
        return bookMapper.findBookList(bookQueryVo);
    }

    @Override
    public Book findBookByBid(String bid) throws Exception {
        return bookMapper.findBookByBid(bid);
    }

    @Override
    public List<Book> findBookByName(String name) throws Exception {
        return bookMapper.findBookByName(name);
    }
}
