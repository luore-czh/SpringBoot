package com.czh.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.wms.entity.User;

import java.util.List;

public interface UserService extends IService<User> {
    public List<User> listAll();
}
