package com.demo.service;

import com.demo.entity.Userinfo;

public interface UserService {

    public void insert(Userinfo user);

    public void insertSelective(Userinfo user);

    public void delete(String id);

    public void update(Userinfo user);

    public Userinfo select(String id);

}
