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

    private Integer commodityid;  //订单表关联商品表

    //业务字段
    private String yewu;
    private String yewu2;
    private String yewu3;
    private String yewu4;


}