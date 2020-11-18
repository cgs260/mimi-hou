package com.jk.service;


import com.jk.entity.Adposition;
import com.jk.entity.Goods;
import com.jk.entity.Order;
import com.jk.entity.Tcarouse;
import com.jk.mapper.TcarMapper;
import com.jk.pojo.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TcarServicelmpl implements TcarService{

      @Resource
      private TcarMapper tcarMapper;


    //广告列表
    @Override
    public PageResult select(Integer currPage, Integer pageSize, Tcarouse tcarouse) {
        //1、查询总条数
        Long total = tcarMapper.findTotal(tcarouse);
        //2、查询每页展示数据
        List<Tcarouse> productList = tcarMapper.findPage(currPage, pageSize, tcarouse);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total, productList, currPage, pageSize, totalPage);
    }

    //查询广告类型表
    @Override
    public List<Adposition> danbiao() {
        return tcarMapper.danbiao();
    }

    @Override
    public void add(Tcarouse tcarouse) {
        if(tcarouse.getSiid()==null){
            tcarMapper.add(tcarouse);
        }else{
            tcarMapper.update(tcarouse);
        }
    }
    //广告表查询
    @Override
    public List<Tcarouse> guang(Tcarouse tcarouse) {
        return tcarMapper.guang(tcarouse);
    }

    @Override
    public void del(Integer siid) {
        tcarMapper.del(siid);
    }

    @Override
    public Tcarouse huixian(Integer siid) {
        return tcarMapper.huixian(siid);
    }





    //广告分类表查询
    @Override
    public List<Adposition> gtype(Adposition adposition) {
        return tcarMapper.gtype(adposition);
    }

    @Override
    public void gadd(Adposition adposition) {
        if(adposition.getId()==null){
            tcarMapper.gadd(adposition);
        }
        tcarMapper.gupdate(adposition);
    }

    @Override
    public void gdelete(Integer id) {
        tcarMapper.gdelete(id);
    }

    @Override
    public Adposition ghuixian(Integer id) {
        return tcarMapper.ghuixian(id);
    }



    //查询订单号所对应的商品
    @Override
    public List<Order> findorder(Order order) {
        return tcarMapper.findorder(order);
    }

    //查询商品表
    @Override
    public List<Goods> findgoods() {
        return tcarMapper.findgoods();
    }
    //商品表回显
    @Override
    public Goods goodshui(Integer id) {
        return tcarMapper.goodshui(id);
    }


}
