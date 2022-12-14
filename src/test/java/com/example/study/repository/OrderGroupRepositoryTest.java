package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.OrderGroup;
import com.example.study.model.enumclass.OrderGroupStatus;
import com.example.study.model.enumclass.OrderType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderGroupRepositoryTest extends StudyApplicationTests {

    @Autowired
    OrderGroupRepository orderGroupRepository;

    @Test
    public void create() {

        OrderGroup orderGroup = new OrderGroup();
        orderGroup.setStatus(OrderGroupStatus.COMPLETE);
        orderGroup.setOrderType(OrderType.ALL);
        orderGroup.setRevAddress("서울시 강남구");
        orderGroup.setRevName("홍길동");
        orderGroup.setPaymentType("CARD");
        orderGroup.setTotalPrice(BigDecimal.valueOf(900000));
        orderGroup.setTotalQuantity(1);
        orderGroup.setOrderAt(LocalDateTime.now().minusDays(2));
        orderGroup.setArrivalDate(LocalDateTime.now());
        orderGroup.setCreatedAt(LocalDateTime.now());
        orderGroup.setCreatedBy("AdminServer");
//      orderGroup.setUserId(1L);

        OrderGroup newOrderGroup = orderGroupRepository.save(orderGroup);

        Assertions.assertNotNull(newOrderGroup);
        Assertions.assertEquals(newOrderGroup.getRevName(), "홍길동");


    }

    @Test
    @Transactional
    public void read() {

    }


}
