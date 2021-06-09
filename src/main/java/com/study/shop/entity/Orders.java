package com.study.shop.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Orders {

    @Id @GeneratedValue
    @Column(name = "orderId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @OneToOne(fetch = FetchType.LAZY) // 주문 정보를 조회 할때 적용쿠폰을 조회?
    @JoinColumn(name = "couponId")
    private Coupon coupon;

    @OneToMany(mappedBy = "order")
    private List<OrderProduct> orderProducts = new ArrayList<>();

}
