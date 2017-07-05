package demo.service;
import demo.mapper.UserMapper;
import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 齐琪 on 2017/7/4.
 */
public class UserService {

    private static int createUserViaXml() { // via 通过\ [ˈvaɪə，ˈviːə]
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
          return sqlSession.insert("demo.mapper.UserMapper.create", new User(null, "Jerry1", "123"));

        }
    }
private static int updateUser() {
    try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
        return sqlSession.update("user.updaste", new User(1, "tester", "test"));
    }
}
private static int deleteUser(){
        try(SqlSession sqlsession=MyBatisSession.getSqlSession(true)){
            return sqlsession.delete("uesr.delete");
        }
}

private static List<User> queryAll(){
    try (SqlSession sqlseeion=MyBatisSession.getSqlSession(false)){
        return sqlseeion.selectList("ueer.queryAll");
    }

}
private static User queryBuId(){
    try(SqlSession sqlSession=MyBatisSession.getSqlSession(false)){
        return sqlSession.selectOne("user.queryById",5);
    }
}

    private static int createUser() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.create(new User(null, "Jerry2", "123"));
        }
    }

    public static void main(String[] args) {
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
