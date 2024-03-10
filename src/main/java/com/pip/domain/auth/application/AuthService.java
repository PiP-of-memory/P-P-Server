package com.pip.domain.auth.application;

import com.pip.domain.auth.domain.Token;
import com.pip.domain.auth.domain.repository.TokenRepository;
import com.pip.domain.auth.dto.*;
import com.pip.domain.user.domain.repository.UserRepository;
import com.pip.global.DefaultAssert;
import com.pip.global.config.security.token.UserPrincipal;
import com.pip.global.payload.ApiResponse;
import com.pip.global.payload.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final TokenRepository tokenRepository;

    private final CustomTokenProviderService customTokenProviderService;

}
