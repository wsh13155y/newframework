package com.demo.service.imp;


import com.demo.dao.UserinfoMapper;
import com.demo.entity.Userinfo;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public void insert(Userinfo user) {
        userinfoMapper.insert(user);
    }

    @Override
    public void insertSelective(Userinfo user) {
        userinfoMapper.insertSelective(user);
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(Userinfo user) {

    }

    @Override
    public Userinfo select(String id) {
        return null;
    }
}
