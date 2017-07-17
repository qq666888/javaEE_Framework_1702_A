package demo.dao;
import java.util.List;

/**
 * Created by 齐琪 on 2017/7/17.
 */
public interface GenericDao<T> { // Model Entity Domain 域

    void create(T t);

    T query(T t);

    List<T> queryAll();

    T queryById(int id);

    void modify(T t);

    void remove(int id);

}
