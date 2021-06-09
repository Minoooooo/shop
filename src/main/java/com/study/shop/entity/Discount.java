package com.study.shop.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Discount {

    @Id
    @GeneratedValue
    @Column(name = "discountId")
    private Long id;


    @Column(name = "discountPrice")
    private Long price;

    @Column(name = "discountPercent")
    private int percent;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;
}
