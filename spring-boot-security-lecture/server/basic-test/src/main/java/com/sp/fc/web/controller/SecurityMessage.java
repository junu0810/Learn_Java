package com.sp.fc.web.controller;


import lombok.*;
import org.springframework.security.core.Authentication;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SecurityMessage {

    private Authentication auth;
    private String message;
}
