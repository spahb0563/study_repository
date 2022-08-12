package com.example.study.model.enumclass;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CategoryType {

    COMPUTER(0, "컴퓨터-전자제품", "컴퓨터입니다."),
    CLOTHING(1, "의류", "의류입니다."),
    MULTI_SHOP(2, "멀티샵", "멀티샵입니다."),
    INTERIOR(3, "인테리어", "인테리어입니다."),
    FOOD(4, "음식", "음식입니다."),
    SPORTS(5, "스포츠", "스포츠입니다."),
    SHOPPING_MALL(6, "쇼핑몰", "쇼핑몰입니다."),
    DUTY_FREE(7, "면세점", "면세점입니다."),
    BEAUTY(8, "화장", "화장입니다.");

    private Integer Id;

    private String title;

    private String description;
}
