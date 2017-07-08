package com.example.demo.mapper;

import com.example.demo.util.MyMapper;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserMapper extends MyMapper<User> {
}