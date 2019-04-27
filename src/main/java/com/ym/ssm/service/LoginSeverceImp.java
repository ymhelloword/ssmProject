package com.ym.ssm.service;

import com.ym.ssm.dao.StudentDao;
import com.ym.ssm.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class LoginSeverceImp implements LoginSeverce {
    @Resource
    private StudentDao studentDao ;
    public User findUserByID(Integer id ) {
        return studentDao.findStudentByID(id) ;
    }

    public int addUser(User user) {
        return studentDao.addUser(user);
    }

    public int updateUser(User user) {
        return studentDao.updateUser(user) ;
    }

    public int deleteUserByID(Integer id) {
        return studentDao.deleteUserByID(id) ;
    }
}
