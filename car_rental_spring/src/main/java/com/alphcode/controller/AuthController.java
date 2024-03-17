package com.alphcode.controller;

import com.alphcode.dto.SignupRequest;
import com.alphcode.dto.UserDto;
import com.alphcode.services.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    ResponseEntity<?> signUpCustomer(@RequestBody SignupRequest signupRequest){
        if(authService.hasCustomerWithEmail(signupRequest.getEmail()))
            return new ResponseEntity<>("email already in use",HttpStatus.NOT_ACCEPTABLE );
        UserDto customerDto = authService.createCustomer(signupRequest);
        if(customerDto==null)
            return new ResponseEntity<>("customer not created", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(customerDto,HttpStatus.CREATED);

    }
}

