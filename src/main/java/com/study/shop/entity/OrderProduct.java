package com.study.shop.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class OrderProduct {

    @Id
    @GeneratedValue
    @Column(name = "orderProductId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId")
    private Orders order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;

}
