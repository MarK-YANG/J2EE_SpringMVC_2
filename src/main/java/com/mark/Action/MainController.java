package com.mark.Action;

import com.mark.Entity.MyUser;
import com.mark.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by mark on 5/2/15.
 */

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String index(){
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<MyUser> json(){
        return userService.getAll();
    }
}


