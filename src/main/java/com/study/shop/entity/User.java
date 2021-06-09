package com.study.shop.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


//GeneratedValue ->
@Entity
@Getter
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "userId")
    private Long id;
    private String email;
    private String username;
    private String pwd;

    @OneToMany(mappedBy = "user")
    private List<UserCoupon> userCoupons = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Cart> carts = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Scrap> scraps = new ArrayList<>();

}
