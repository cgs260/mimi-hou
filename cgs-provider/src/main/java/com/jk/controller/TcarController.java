package com.jk.controller;


import com.jk.entity.Adposition;
import com.jk.entity.Tcarouse;
import com.jk.pojo.PageResult;
import com.jk.service.TcarService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TcarController {

     @Resource
     private TcarService tcarService;

     //广告列表
     @RequestMapping("/select")
     public PageResult select(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, @RequestBody Tcarouse tcarouse) {
          return tcarService.select(currPage, pageSize, tcarouse);
     }
     //广告表查询
     @RequestMapping("/guang")
     public List<Tcarouse> guang(@RequestBody Tcarouse tcarouse){
          return tcarService.guang(tcarouse);
     }

     //查询广告类型表
     @RequestMapping("/danbiao")
     public List<Adposition> danbiao(){
          return tcarService.danbiao();
     }

     @RequestMapping("/add")
     public void add(@RequestBody Tcarouse tcarouse){
          tcarService.add(tcarouse);
     }

     @RequestMapping("/del")
     public void del(@RequestParam Integer siid){
          tcarService.del(siid);
     }

     @RequestMapping("/huixian")
     public Tcarouse huixian(@RequestParam Integer siid){
          return tcarService.huixian(siid);
     }



     //广告分类表查询
     @RequestMapping("/gtype")
     public List<Adposition> gtype(@RequestBody Adposition adposition){
          return tcarService.gtype(adposition);
     }

     @RequestMapping("/gadd")
     public void gadd(@RequestBody Adposition adposition){
          tcarService.gadd(adposition);
     }

     @RequestMapping("gdelete")
     public void gdelete(@RequestParam Integer id){
          tcarService.gdelete(id);
     }

     @RequestMapping("/ghuixian")
     public Adposition ghuixian(@RequestParam Integer id){
          return tcarService.ghuixian(id);
     }




}
