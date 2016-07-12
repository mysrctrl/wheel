package com.wheel.service.impl;  
  
import javax.annotation.Resource;  
  
import org.springframework.stereotype.Service;  
  
import com.wheel.dao.UserDao;  
import com.wheel.pojo.User;  
import com.wheel.service.IUserService;  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserDao userDao;  
//    @Override  
    public int getUserCount(int userId) {  
        // TODO Auto-generated method stub  
    	User user = new User();
        return this.userDao.insertSelective(user); 
    }
}