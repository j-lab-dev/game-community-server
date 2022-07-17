package com.gamecommunityserver.controller;

import com.gamecommunityserver.dto.UserDTO;
import com.gamecommunityserver.service.ResponseService;
import com.gamecommunityserver.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: RestController 역할 작성하기
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;

    // TODO: 객체 생성자 패턴엔 3가지(생성자, 필드, 메서드) 택한이유
    @Autowired
    public UserController(UserServiceImpl userService, ResponseService responseService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public void signUp(@RequestBody UserDTO userDTO)
    {
        if(UserDTO.hasNullValueUserInfo(userDTO))
            throw new NullPointerException("필수 회원정보를 모두 입력해야 합니다.");
        userService.register(userDTO);
    }

}
