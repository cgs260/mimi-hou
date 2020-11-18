package com.jk.service;

import com.jk.entity.Adposition;
import com.jk.entity.Goods;
import com.jk.entity.Order;
import com.jk.entity.Tcarouse;
import com.jk.pojo.PageResult;

import java.util.List;

public interface TcarService {
    //广告列表
    PageResult select(Integer currPage, Integer pageSize, Tcarouse tcarouse);
    //查询广告类型表
    List<Adposition> danbiao();

    void add(Tcarouse tcarouse);
    //广告表查询
    List<Tcarouse> guang(Tcarouse tcarouse);

    void del(Integer siid);

    Tcarouse huixian(Integer siid);



    //广告分类表查询
    List<Adposition> gtype(Adposition adposition);

    void gadd(Adposition adposition);

    void gdelete(Integer id);

    Adposition ghuixian(Integer id);


    //查询订单号所对应的商品

    List<Order> findorder(Order order);
    //查询商品表
    List<Goods> findgoods();
    //商品表回显
    Goods goodshui(Integer id);
}
