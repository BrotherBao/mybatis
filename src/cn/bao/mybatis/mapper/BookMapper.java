package cn.bao.mybatis.mapper;

import cn.bao.mybatis.entity.Book;
import cn.bao.mybatis.entity.BookCostom;
import cn.bao.mybatis.entity.BookQueryVo;

import java.util.List;

public interface BookMapper {
    Book findBookByIdResultMap(String bid) throws  Exception;

    Integer findBookCount(BookQueryVo bookQueryVo) throws  Exception;

    List<BookCostom> findBookList(BookQueryVo bookQueryVo) throws  Exception;

    Book findBookByBid(String bid) throws Exception;

    List<Book> findBookByName(String name) throws Exception;
}
