package com.citi.portfoliomanager.service.IService;

import com.citi.portfoliomanager.entity.Users;

public interface IUsersService {
    Users createUsers(int id ,String name,String pwd,int usertype);

}
