package com.example.study.model.enumclass;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public enum AdminUserRole {

    SUPER(0, "수퍼관리자", "모든 권한을 가진 수퍼관리자 입니다."),
    NORMAL(1, "일반관리자", "일부 권한을 가진 일반관리자 입니다.");

    private Integer Id;

    private String title;

    private String description;
}
