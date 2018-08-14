package cn.mayn.com.service.impl;

import cn.mayn.com.mapper.UserMapper;
import cn.mayn.com.model.UserEntity;
import cn.mayn.com.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Value("${jdbc_url}")
    String sss;

    @Override
    public List<UserEntity> findData() {
        return userMapper.findData();
    }

    @Test
    public void testValue(){
        System.out.println(sss);
    }
}
