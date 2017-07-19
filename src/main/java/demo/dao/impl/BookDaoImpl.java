package demo.dao.impl;
import demo.dao.BookDao;
import demo.model.Book;
import org.springframework.stereotype.Repository;


/**
 * Created by 齐琪 on 2017/7/17.
 */

@Repository
public class BookDaoImpl extends GenericDaoImpl<Book> implements BookDao {
}