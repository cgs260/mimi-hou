package com.jk.controller;


import com.jk.entity.Adposition;
import com.jk.entity.Tcarouse;
import com.jk.pojo.PageResult;
import com.jk.service.TcarService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TcarController {

     @Resource
     private TcarService tcarService;


    //广告列表
    @RequestMapping("/chaxun")
    public PageResult select(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,  Tcarouse tcarouse) {
        return tcarService.select(currPage, pageSize, tcarouse);
    }

    //查询广告类型表
    @RequestMapping("/liebiao")
    public List<Adposition> danbiao(){
        return tcarService.danbiao();
    }

    @RequestMapping("/xin")
    @RequiresPermissions("ding:save")
    public void add(Tcarouse tcarouse){
        tcarService.add(tcarouse);
    }

    //广告表查询
    @RequestMapping("/guangx")
    @RequiresPermissions("ding:query")
    public List<Tcarouse> guang(Tcarouse tcarouse){
        return tcarService.guang(tcarouse);
    }

    @RequestMapping("/shanchu")
    @RequiresPermissions("ding:delete")
    public void del(Integer siid){
        tcarService.del(siid);
    }

    @RequestMapping("/update")
    @RequiresPermissions("ding:update")
    public Tcarouse huixian(Integer siid){
        return tcarService.huixian(siid);
    }



    //广告分类表查询
    @RequestMapping("/ww")
    @RequiresPermissions("fei:query")
    public List<Adposition> gtype(Adposition adposition){
        return tcarService.gtype(adposition);
    }

    @RequestMapping("/wadd")
    @RequiresPermissions("fei:save")
    public void gadd(Adposition adposition){
        tcarService.gadd(adposition);
    }

    @RequestMapping("wdelete")
    @RequiresPermissions("fei:delete")
    public void gdelete(Integer id){
        tcarService.gdelete(id);
    }

    @RequestMapping("/whuixian")
    @RequiresPermissions("fei:update")
    public Adposition ghuixian(Integer id){
        return tcarService.ghuixian(id);
    }


}
