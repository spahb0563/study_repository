package com.example.study.model.network.response;


import com.example.study.model.enumclass.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserApiResponse {

    private Long id;

    private String account;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    private String email;

    private String phoneNumber;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;
}
