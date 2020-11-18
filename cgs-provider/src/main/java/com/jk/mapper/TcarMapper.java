package com.jk.mapper;


import com.jk.entity.Adposition;
import com.jk.entity.Goods;
import com.jk.entity.Order;
import com.jk.entity.Tcarouse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TcarMapper {
    //广告列表
    Long findTotal(@Param("tcarouse") Tcarouse tcarouse);

    List<Tcarouse> findPage(@Param("currPage")Integer currPage, @Param("pageSize")Integer pageSize, @Param("tcarouse")Tcarouse tcarouse);
    //查询广告类型表
    List<Adposition> danbiao();

    void add(Tcarouse tcarouse);
    //广告表查询
    List<Tcarouse> guang(@Param("tcarouse")Tcarouse tcarouse);

    void del(Integer siid);

    Tcarouse huixian(Integer siid);

    void update(Tcarouse tcarouse);





    //广告分类表查询
    List<Adposition> gtype(@Param("adposition")Adposition adposition);

    void gadd(Adposition adposition);

    void gdelete(Integer id);

    Adposition ghuixian(Integer id);

    void gupdate(Adposition adposition);


    //查询订单号所对应的商品
    List<Order> findorder(@Param("order") Order order);
    //查询商品表
    List<Goods> findgoods();
    //商品表回显
    Goods goodshui(Integer id);
}
