package com.citi.portfoliomanager.dao;

import com.citi.portfoliomanager.dao.mapper.UsersMapper;
import com.citi.portfoliomanager.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDao {
    @Autowired
    private UsersMapper usersMapper;

    public Users createUsers(int id, String name, String pwd, int usertype){
        return usersMapper.createUsers(id,name,pwd,usertype);
    }
}
