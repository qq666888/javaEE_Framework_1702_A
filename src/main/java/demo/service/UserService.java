package demo.service;
import demo.mapper.UserMapper;
import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 齐琪 on 2017/7/4.
 * UserService和MyBatis是强耦合
 */
public class UserService {
    private InterfaceTest interfaceTest;

    private  int createUser() {
        return interfaceTest.createUser();
    }
    /*  private static int createUserViaXml() { // via 通过\ [ˈvaɪə，ˈviːə]

    }*/
private  int updateUser() {
    return interfaceTest.updateUser();


}

private  int deleteUser(){
return interfaceTest.deleteUser();
}
    private  List<User> queryAll(){

return interfaceTest.queryAll();
}

private  User queryBuId(){
return interfaceTest.queryById();
}
    public  void main(String[] args) {
        //  System.out.println(createUserViaXml());
        //  System.out.println(createUser());
//        List<User>users=queryAll();
//        for(User uesr:users){
//            System.out.println(uesr);
//        }
//    }
        System.out.println(queryBuId());
    }
}
