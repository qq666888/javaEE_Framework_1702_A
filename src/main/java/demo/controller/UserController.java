package demo.controller;
import demo.dao.UserDao;
import demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 齐琪 on 2017/7/14.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    @Autowired // 自动装配
    private UserDao userDao;

    @RequestMapping("create")
    private String create(User user) {
        userDao.create(user);
        return "redirect:/default.jsp";
    }

    @RequestMapping("signIn")
    private String signIn(User user) {
        user = userDao.query(user);
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/book/queryAll";
        }
        request.setAttribute("message", "用户名或密码错误");
        return "/default.jsp";
    }

    @RequestMapping("signOut")
    private String signOut() {
        session.invalidate();
        return "redirect:/default.jsp";
    }
}