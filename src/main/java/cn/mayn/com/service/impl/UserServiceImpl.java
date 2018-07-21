package cn.mayn.com.service.impl;

import cn.mayn.com.mapper.UserMapper;
import cn.mayn.com.model.UserEntity;
import cn.mayn.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserEntity> findData() {
        return userMapper.findData();
    }
}
