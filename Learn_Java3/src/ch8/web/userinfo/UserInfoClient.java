package ch8.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch8.domain.userinfo.UserInfo;
import ch8.domain.userinfo.dao.UserInfoDao;
import ch8.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch8.domain.userinfo.dao.oracle.UserInfoOraclelDao;

//하나의 인터페이스를 여러 객체가 구현하게 되면 
//클라이언트 프로그램은 인터페이스의 메서드를 활용하여 여러 객체의 구현을 사용할 수 있음 (다형성)
public class UserInfoClient {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("/Users/junu0810/Desktop/practice/Java/Learn_Java3/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");
        
        UserInfo user1 = new UserInfo();
        user1.setUserId("12345");

        UserInfoDao userInfoDao = null;
        //equals를 사용해서 비교해야하는 이유 https://codechacha.com/ko/java-string-compare/
        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOraclelDao();
        }
        else if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }
        else{
            System.out.println("System ERROR");
        }

        userInfoDao.insertUserInfo(user1);
        userInfoDao.updateUserInfo(user1);
        userInfoDao.deleteUserInfo(user1);
        
    }
}
