package cn.bao.mybatis.test;

import cn.bao.mybatis.entity.Book;
import cn.bao.mybatis.entity.BookCostom;
import cn.bao.mybatis.entity.BookQueryVo;
import cn.bao.mybatis.mapper.BookMapperImp;
import org.junit.Test;

import java.util.List;

public class TestMain {
    @Test
    public void testFindBookByBid() throws Exception {
        BookMapperImp bookMapperImp = new BookMapperImp();
        Book book = bookMapperImp.findBookByBid("1");
        System.out.println(book);
    }
    @Test
    public void testFindBookByName() throws Exception {
        BookMapperImp bookMapperImp = new BookMapperImp();
        List<Book> bookList = bookMapperImp.findBookByName("孙");
        System.out.println(bookList);
    }
    @Test
    public void testFindBookList() throws Exception {
        BookMapperImp bookMapperImp = new BookMapperImp();
        BookQueryVo bookQueryVo = new BookQueryVo();
        BookCostom bookCostom = new BookCostom();
        bookCostom.setBname("JavaWeb开发详解");
        bookCostom.setAuthor("孙");
        bookQueryVo.setBookCostom(bookCostom);
        List<BookCostom> bookCostomList = bookMapperImp.findBookList(bookQueryVo);
        System.out.println(bookCostomList);

    }
    @Test
    public void testFindBookCount() throws Exception {
        BookMapperImp bookMapperImp = new BookMapperImp();
        BookQueryVo bookQueryVo = new BookQueryVo();
        BookCostom bookCostom = new BookCostom();
        bookCostom.setBname("JavaWeb开发详解");
        bookCostom.setAuthor("孙");
        bookQueryVo.setBookCostom(bookCostom);
        int bookCount = bookMapperImp.findBookCount(bookQueryVo);
        System.out.println(bookCount);
    }

    @Test
    public void testFindBookByIdResultMap() throws Exception {
        BookMapperImp bookMapperImp = new BookMapperImp();
        Book book = bookMapperImp.findBookByIdResultMap("1");
        System.out.println(book);
    }
}
