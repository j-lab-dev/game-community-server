package com.gamecommunityserver.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserDTO {
    private int number;
    private String id;
    private String password;
    private String name;
    private int admin;
    private Date createDate;
    private int userSecession;

    public UserDTO(){
    }

    public UserDTO(int number, String id, String password, String name, int admin, Date createDate, int userSecession){
        this.number = number;
        this.id = id;
        this.password = password;
        this.name = name;
        this.admin = admin;
        this.createDate = createDate;
        this.userSecession = userSecession;
    }

    // TODO: 유효성 검사시에도 NULL, "" 조건이 꼭 필요한 상황일떄만 확인한다.
    public static boolean hasNullValueUserInfo(UserDTO userDTO){
        return userDTO.getId() == null || userDTO.getPassword() == null || userDTO.getName() == null;
    }
}
