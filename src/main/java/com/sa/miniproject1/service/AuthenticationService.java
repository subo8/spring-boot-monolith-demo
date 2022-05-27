package com.sa.miniproject1.service;

import com.sa.miniproject1.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
