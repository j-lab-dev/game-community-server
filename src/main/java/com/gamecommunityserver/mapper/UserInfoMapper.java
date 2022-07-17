package com.gamecommunityserver.mapper;

import com.gamecommunityserver.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    int idCheck(String id);
    int register(UserDTO userDTO);
    int count();
}