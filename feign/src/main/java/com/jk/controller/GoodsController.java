package com.jk.controller;

import com.jk.entity.*;
import com.jk.pojo.PageResult;
import com.jk.service.GoodsService;
import com.jk.utils.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    @RequestMapping("category")
    public String category(){
        return "goods/categoryList";
    }
    @RequestMapping("findCategory")
    @ResponseBody
    public PageResult findCategory(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize, @RequestParam(value = "parentId",defaultValue = "0") Integer parentId){
        return goodsService.findCategory(currPage,pageSize,parentId);
    }
    @RequestMapping("categoryList")
    @ResponseBody
    public List<Category> categoryTree(@RequestParam(value = "parentId",defaultValue = "0") Integer parentId){
        return goodsService.categoryList(parentId);
    }
    @RequestMapping("saveCategory")
    @ResponseBody
    public void saveCategory(Category category){

        goodsService.saveCategory(category);

    }
    /*@RequestMapping("findCategoryOne")
    public String findCategoryOne(Integer id, Model model){
        Category category =goodsService.findCategoryOne(id);
        model.addAttribute("category",category);
        return "goods/saveCategory";
    }*/
    @RequestMapping("findCategoryOne")
    @ResponseBody
    public Category findCategoryOne(Integer id, Model model){
        Category category =goodsService.findCategoryOne(id);

        return category;
    }
    @RequestMapping("deleteCategory")
    @ResponseBody
    public void deleteCategory(Integer id){
        goodsService.deleteCategory(id);
    }

    @RequestMapping("uploadImg")
    @ResponseBody
    public String uploadImg(MultipartFile img,HttpServletRequest request){
        return FileUtil.FileUpload(img, request);
    }


    @RequestMapping("goods")
    public String goods(){
        return "goods/goods_spu";
    }
    @RequestMapping("findGoods")
    @ResponseBody
    public List<Goods> findGoods(Goods goods){
        return goodsService.findGoods(goods);
    }

    @RequestMapping("attributeKey")
    @ResponseBody
    public List<AttributeKey> attributeKey(Integer categoryId){
        return goodsService.attributeKey(categoryId);
    }

    @RequestMapping("attributeValue")
    @ResponseBody
    public List<AttributeValue> attributeValue(Integer keyId){
        return goodsService.attributeValue(keyId);
    }
    @RequestMapping("saveGoods")
    @ResponseBody
    public void saveGoods(Goods goods){
        System.out.println(goods);
        System.out.println(goods.getGoodsSpecs());

        goodsService.saveGoods(goods);
    }
    @RequestMapping("findGoodsOne")
    @ResponseBody
    public Goods findGoodsOne(@RequestParam Integer id){
        return goodsService.findGoodsOne(id);
    }

    @RequestMapping("deleteGoods")
    @ResponseBody
    public void deleteGoods(Integer id){
        goodsService.deleteGoods(id);
    }

    @RequestMapping("findOrder")
    @ResponseBody
    public List<Order> findOrder(Order order){
        return goodsService.findOrder(order);

    }
    @RequestMapping("delOrderById")
    @ResponseBody
    public void delOrderById(Integer id){
        goodsService.delOrderById(id);
    }
    @RequestMapping("findOrderById")
    @ResponseBody
    public Order findOrderById(Integer id){
        return goodsService.findOrderById(id);
    }

    @RequestMapping("saveOrder")
    @ResponseBody
    public void saveOrder(Order order){
        goodsService.saveOrder(order);
    }

    @RequestMapping("highcharts")
    @ResponseBody
    public List<Goods> highcharts(){
        return goodsService.highcharts();
    }

    @RequestMapping("changeOrderStatus")
    @ResponseBody
    public void changeOrderStatus(Integer id){
        goodsService.changeOrderStatus(id);
    }
}
