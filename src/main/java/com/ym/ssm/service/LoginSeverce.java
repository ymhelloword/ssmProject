package com.ym.ssm.service;

import com.ym.ssm.entity.User;

public interface LoginSeverce {
    public User findUserByID(Integer id) ;
    public int addUser(User user) ;
    public int updateUser(User user) ;
    public int deleteUserByID(Integer id) ;
}
