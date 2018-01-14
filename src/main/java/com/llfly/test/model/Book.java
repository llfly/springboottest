package com.llfly.test.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by fangyou on 2018/1/14.
 */

@Data
@Entity // 一个JPA实体
public class Book {

    @Id // 实体唯一标示
    @GeneratedValue(strategy= GenerationType.AUTO)  // 自增
    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
