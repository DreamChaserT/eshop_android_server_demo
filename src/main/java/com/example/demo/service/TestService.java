package com.example.demo.service;

import com.example.demo.model.TestModel;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by Cmglz on 2017/7/8.
 */
@Service
public class TestService {
    @Cacheable(value = "testCache",keyGenerator = "customizedKeyGenerator")
    public String getTestNum(){
        System.out.println("无缓存的时候调用这里");
        return "test_word";
    }
}
