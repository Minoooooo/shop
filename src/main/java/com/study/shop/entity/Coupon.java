package com.study.shop.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Coupon {

    @Id
    @GeneratedValue
    @Column(name = "couponId")
    private Long id;

    @OneToMany(mappedBy = "coupon")
    private List<UserCoupon> userCoupons = new ArrayList<>();
}
