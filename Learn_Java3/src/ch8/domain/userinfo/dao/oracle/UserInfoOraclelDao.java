package ch8.domain.userinfo.dao.oracle;

import ch8.domain.userinfo.UserInfo;
import ch8.domain.userinfo.dao.UserInfoDao;

public class UserInfoOraclelDao implements UserInfoDao{

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB userID " + userInfo.getUserId());
    }
    
    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into Oracle DB userID " + userInfo.getUserId());
        
    }
    
    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete into Oracle DB userID " + userInfo.getUserId());
        
    }
    
}
