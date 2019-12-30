package com.smart.web;
import com.smart.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.smart.service.UserService;

import javax.servlet.http.HttpServletRequest;

//----update2019-12-30 aSD
@Controller
public class LoginController {

    private UserService userService;
    private UserService userDemoService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/tologin")
    public String tologin(){
        System.out.println("123123123");
        return "login";
    }

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, User user){
        System.out.println(user.getUsername());
        boolean isValidUser=userService.hasMatch(user.getUsername(),user.getPassword());
        if (isValidUser){
            request.getSession().setAttribute("user",user);
            return new ModelAndView("success");
        }else{
            return new ModelAndView("login","error","用户名或账户错误");
        }
    }

}
