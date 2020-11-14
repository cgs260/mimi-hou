package com.jk.service;

import com.jk.entity.*;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "goods-provider")
public interface GoodsService {
    @RequestMapping("goods/findCategory")
    public PageResult findCategory(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize, @RequestParam(value = "parentId",defaultValue = "0") Integer parentId);

    @RequestMapping("goods/categoryList")
    public List<Category> categoryList(@RequestParam(value = "parentId",defaultValue = "0") Integer parentId);

    @RequestMapping("goods/saveCategory")
    public void saveCategory(@RequestBody Category category);
    @RequestMapping("goods/findCategoryOne")
    public Category findCategoryOne(@RequestParam Integer id);
    @RequestMapping("goods/deleteCategory")
    public void deleteCategory(@RequestParam Integer id);
    @RequestMapping("goods/findGoods")
    public List<Goods> findGoods(@RequestBody Goods goods);

    @RequestMapping("goods/attributeKey")
    public List<AttributeKey> attributeKey(@RequestParam Integer categoryId);

    @RequestMapping("goods/attributeValue")
    public List<AttributeValue> attributeValue(@RequestParam Integer keyId);

    @RequestMapping("goods/saveGoods")
    public void saveGoods(@RequestBody Goods goods);

    @RequestMapping("goods/findGoodsOne")
    public Goods findGoodsOne(@RequestParam Integer id);

    @RequestMapping("goods/findOrder")
    public List<Order> findOrder(@RequestBody Order order);

    @RequestMapping("goods/delOrderById")
    public void delOrderById(@RequestParam Integer id);
    @RequestMapping("goods/findOrderById")
    public Order findOrderById(@RequestParam Integer id);

    @RequestMapping("goods/saveOrder")
    public void saveOrder(@RequestBody Order order);

    @RequestMapping("goods/highcharts")
    public List<Goods> highcharts();
}
