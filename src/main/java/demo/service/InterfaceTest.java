package demo.service;
import demo.model.User;

import java.util.List;

/**
 * Created by 齐琪 on 2017/7/7.
 */
public interface InterfaceTest {
    int createUser();
    int updateUser();
    int deleteUser();

    List<User> queryAll();
    User queryById();
}
