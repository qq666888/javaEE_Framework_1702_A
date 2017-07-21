package demo.dao;
import demo.model.Book;

import java.util.List;

/**
 * Created by 齐琪 on 2017/7/17.
 */
public interface BookDao extends GenericDao<Book> {
}
/*
DAO 接口的模板 template 模板\ ['templeɪt\;\ -plɪt]
package demo.dao;
import demo.model.{model};
public interface {model}Dao extends GenericDao<{model}> {}
 */
