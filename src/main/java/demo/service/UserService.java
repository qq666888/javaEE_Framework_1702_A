package demo.service;
import demo.model.User;

/**
 * Created by 齐琪 on 2017/7/18.
 */
public interface UserService extends GenericService<User> {
    User signIn(User user);

    boolean signUp(User user);
}
