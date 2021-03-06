package demo.dao;
import demo.model.User;

import java.util.List;

/**
 * Created by 齐琪 on 2017/7/17.
 *  ###通用的###数据库操作
 */
public interface GenericDao<T> { // Model Entity Domain 域

    void create(T t);

    T query(String statement, Object parameter);

    List<T> queryAll();

//    List<T> queryList(String statement, Object parameter);

    T queryById(int id);

    void modify(T t);

    void modify(String statement, Object parameter);

    void remove(int id);

}