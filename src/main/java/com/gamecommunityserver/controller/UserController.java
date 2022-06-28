package com.gamecommunityserver.controller;

import com.gamecommunityserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("register")
    void register(){

    }

    @PostMapping("/download")
    void download(String type){
        if(type=="window"){
            // downloadService.windowClientdown();
        } else {

        }

    }

}
