package com.alphcode.services.auth;

import com.alphcode.dto.UserDto;
import com.alphcode.dto.SignupRequest;

public interface AuthService {
    UserDto createCustomer(SignupRequest request);
}
