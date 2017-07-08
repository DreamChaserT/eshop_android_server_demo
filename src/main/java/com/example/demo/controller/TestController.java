package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.security.MyUserDetails;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Cmglz on 2017/7/8.
 */
@Controller
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TestService testService;

    @RequestMapping(path = "/test",method = RequestMethod.POST)
    @ResponseBody
    public String test(HttpServletRequest request){
//        System.out.println("====================================");
//        MyUserDetails myUserDetails=(MyUserDetails)((SecurityContext)request.getSession().getAttribute("SPRING_SECURITY_CONTEXT")).getAuthentication()
//                .getPrincipal();
//        request.getSession(true).setAttribute("test","999");

        return testService.getTestNum();
    }

    @RequestMapping(path = "/succ",method = RequestMethod.POST)
    @ResponseBody
    public ModelMap test2(HttpServletRequest request){
        ModelMap res=new ModelMap();
        res.put("status",200);
        res.put("Message","succ");
        System.out.println("============================================="+request.getSession(true).getAttribute("test"));
        return res;
    }

    @RequestMapping(path = "/error",method = RequestMethod.POST)
    @ResponseBody
    public ModelMap error(){
        ModelMap res=new ModelMap();
        res.put("status",401);
        res.put("Message","error");
        return res;
    }


}
