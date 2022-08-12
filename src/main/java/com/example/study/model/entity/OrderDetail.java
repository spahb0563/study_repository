package com.example.study.model.entity;

import com.example.study.model.enumclass.OrderDetailStatus;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = {"item", "orderGroup"})
@EntityListeners(AuditingEntityListener.class)
@Builder // 빌더 패턴 적용
@Accessors(chain = true)
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private OrderDetailStatus status;

    private LocalDateTime arrivalDate;

    private Integer quantity;

    private BigDecimal totalPrice;

    @CreatedDate
    private LocalDateTime createdAt;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @LastModifiedBy
    private String updatedBy;


    // OrderDetail 1 : N Item

    @ManyToOne
    private Item item;

    // OrderDetail N : 1 OrderGroup
    @ManyToOne
    private OrderGroup orderGroup;

    // N : 1
//    @ManyToOne
//    private User user; // 반드시 객체의 이름을 적어줘야함 - > user_id 자동으로 변환
//
//    @ManyToOne
//    private Item item;
}
