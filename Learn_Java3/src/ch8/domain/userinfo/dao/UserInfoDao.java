package ch8.domain.userinfo.dao;

import ch8.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo (UserInfo userInfo);
    void updateUserInfo (UserInfo userInfo);
    void deleteUserInfo (UserInfo userInfo);
    
}
