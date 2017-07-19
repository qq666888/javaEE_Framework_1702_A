package demo.dao.impl;
import demo.dao.UserDao;
import demo.model.User;
import org.springframework.stereotype.Repository;



/**
 * Created by 齐琪 on 2017/7/14.
 */

@Repository
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {
}