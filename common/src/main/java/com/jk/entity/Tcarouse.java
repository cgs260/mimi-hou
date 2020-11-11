package com.jk.entity;


import lombok.Data;

@Data
public class Tcarouse {

      private Integer siid;

      private Integer adid; //广告分类id

      private String title;

      private String url;

      private Integer status;

      private Integer siorder;

      //业务字段
      private String yewu;
      private String yewu2;
}
