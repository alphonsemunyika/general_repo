package com.alphcode.dto;

import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String name;
    private String email;
    private String userRole;
}
