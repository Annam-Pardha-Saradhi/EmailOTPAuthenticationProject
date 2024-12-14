package com.mani.emailOtpVerification.service;

import com.mani.emailOtpVerification.requests.RegisterRequest;
import com.mani.emailOtpVerification.responses.RegisterResponse;

public interface UserService {

    RegisterResponse register(RegisterRequest registerRequest);

    void verify(String email,String otp);
}
