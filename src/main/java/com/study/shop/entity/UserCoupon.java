package com.study.shop.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class UserCoupon {

    @GeneratedValue @Id
    @Column(name = "userCouponId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "couponId")
    private Coupon coupon;
}
