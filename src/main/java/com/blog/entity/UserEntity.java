package com.blog.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private boolean admin;
//
//    @JoinColumn
//    private
}
