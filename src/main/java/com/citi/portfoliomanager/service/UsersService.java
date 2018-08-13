package com.citi.portfoliomanager.service;

import com.citi.portfoliomanager.dao.UsersDao;
import com.citi.portfoliomanager.entity.User;
import com.citi.portfoliomanager.entity.Users;
import com.citi.portfoliomanager.service.IService.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements IUsersService {
    @Autowired
    private UsersDao usersDao;


    @Override
    public Users createUsers(int id,String name,String pwd,int usertype) {
        return usersDao.createUsers(id,name,pwd,usertype);
    }
}
