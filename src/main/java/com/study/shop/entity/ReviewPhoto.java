package com.study.shop.entity;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class ReviewPhoto {

    @Id
    @GeneratedValue
    @Column(name = "reviewPhotoId")
    private Long id;

    @OneToOne
    private Review review;

}
