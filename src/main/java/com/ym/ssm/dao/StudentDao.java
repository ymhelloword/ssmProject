package com.ym.ssm.dao;
import com.ym.ssm.entity.User;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentDao {
    public User findStudentByID(Integer id) ;
    public int addUser(User user) ;
    public int updateUser(User user) ;
    public int deleteUserByID(Integer id) ;
}
