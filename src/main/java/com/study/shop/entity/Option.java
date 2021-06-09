package com.study.shop.entity;

import com.study.shop.enums.OptionStatus;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Option {

    @Id
    @GeneratedValue
    @Column(name = "optionId")
    private Long id;

    @Column(name = "optionName")
    private String name;

    @Column(name = "optionPrice")
    private Long price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;

    @Enumerated(EnumType.STRING)
    @Column(name = "optionStatus")
    private OptionStatus status;
}
