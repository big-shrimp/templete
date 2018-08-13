package com.citi.portfoliomanager.dao.mapper;

import com.citi.portfoliomanager.entity.Users;

public interface UsersMapper {
   Users createUsers(int id, String name, String pwd, int usertype);
}
