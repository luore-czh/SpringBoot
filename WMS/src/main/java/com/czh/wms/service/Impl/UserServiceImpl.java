package com.czh.wms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.wms.entity.User;
import com.czh.wms.mapper.UserMapper;
import com.czh.wms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> listAll() {
        return userMapper.listAll();
    }
}
