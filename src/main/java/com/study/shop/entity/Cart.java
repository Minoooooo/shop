package com.study.shop.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Cart {

    @Id
    @GeneratedValue
    @Column(name = "cartId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;
}
