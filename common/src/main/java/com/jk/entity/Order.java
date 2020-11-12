package com.jk.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Order {
    private Integer id;

    private Integer userid;

    private String ordernum;

    private Integer shopid;

    private String shopname;

    private BigDecimal ordersumprice;

    private Integer orderstatus;

    private Integer addressid;

    private String receivingaddress;

    private String receivingtelephone;

    private String consignee;

    private Date createtime;

    private String serialnumber;

    private String paytype;

    private Date paymenttime;

    private String waybiinumber;

    private Date sendtime;

    private Date closingtime;


}