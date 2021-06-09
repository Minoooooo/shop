package com.study.shop.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Scrap {

    @Id
    @GeneratedValue
    @Column(name = "scrapId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;

    private String useYn; // 빅데이터용
}
