package demo.dao.impl;
import demo.dao.BookDao;
import demo.model.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 齐琪 on 2017/7/17.
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void create(Book book) {
        sqlSession.insert("book.create", book);
    }

    @Override
    public Book query(Book book) {
        return null;
    }

    @Override
    public List<Book> queryAll() {
        return sqlSession.selectList("book.queryAll");
    }

    @Override
    public Book queryById(int id) {
        return sqlSession.selectOne("book.queryById", id);
    }

    @Override
    public void modify(Book book) {
        sqlSession.update("book.modify", book);
    }

    @Override
    public void remove(int id) {
        sqlSession.delete("book.remove", id);
    }
}
