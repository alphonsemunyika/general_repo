package com.alphcode.services.auth;

import com.alphcode.dto.UserDto;
import com.alphcode.dto.SignupRequest;
import com.alphcode.entity.User;

import java.util.Optional;

public interface AuthService {
    UserDto createCustomer(SignupRequest request);

  boolean hasCustomerWithEmail(String email);
}
