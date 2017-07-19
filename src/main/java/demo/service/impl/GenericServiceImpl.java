package demo.service.impl;
import demo.service.GenericService;

import java.util.List;

/**
 * Created by 齐琪 on 2017/7/18.
 */
public class GenericServiceImpl<T> implements GenericService<T> {

    @Override
    public void create(T t) {

    }

    @Override
    public T query(String statement, Object parameter) {
        return null;
    }

    @Override
    public List<T> queryAll() {
        return null;
    }

    @Override
    public T queryById(int id) {
        return null;
    }

    @Override
    public void modify(T t) {

    }

    @Override
    public void modify(String statement, Object parameter) {

    }

    @Override
    public void remove(int id) {

    }
}
