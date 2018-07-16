package com.example.springbootdemo.domain.user;

import com.example.springbootdemo.domain.BaseDO;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDO extends BaseDO {

    private Long id;

    private String username;

    private String password;

}
