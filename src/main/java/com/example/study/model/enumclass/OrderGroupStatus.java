package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderGroupStatus {

    COMPLETE(0, "완료", "배송 완료상태"),
    WAITING(1, "대기중", "배송 대기상태"),
    ORDERING(2, "주문확인중", "주문 확인상태"),
    CONFIRM(3, "주문완료", "주문 완료상태");


    private Integer id;

    private String title;

    private String description;

}
