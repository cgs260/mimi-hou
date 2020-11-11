package com.jk.entity;

import lombok.Data;

import java.util.Date;


@Data
public class Adposition {
    private Long id; //关联id

    private Date createddate;

    private Date lastmodifieddate;

    private Long version;

    private String description;

    private Integer height;

    private String name;

    private String template;

    private Integer width;
}