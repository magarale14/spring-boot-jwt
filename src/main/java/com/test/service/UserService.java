package com.test.service;

import java.util.List;

import com.devglan.model.User;
import com.test.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
