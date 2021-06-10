package com.study.shop.entity;

import com.study.shop.enums.ProductStatus;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "productId")
    private Long id;

    @Column(name = "prodcutName")
    private String name;

    @Column(name = "productPrice")
    private Long price;

    @OneToMany(mappedBy = "product")
    private List<OrderProduct> orderProducts = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<Option> options = new ArrayList<>();

    @OneToOne(mappedBy = "product", fetch = FetchType.LAZY)
    private Discount discount;

    @Enumerated(EnumType.STRING)
    @Column(name = "productStatus")
    private ProductStatus status;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews = new ArrayList<>();


}
