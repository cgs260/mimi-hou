package com.jk.service;

import com.jk.entity.Adposition;
import com.jk.entity.Tcarouse;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(value = "cgs-provider")
public interface TcarService {



    //广告列表
    @RequestMapping("/select")
    public PageResult select(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, @RequestBody Tcarouse tcarouse);

    //查询广告类型表
    @RequestMapping("/danbiao")
    public List<Adposition> danbiao();

    @RequestMapping("/add")
    public void add(@RequestBody Tcarouse tcarouse);

    //广告表查询
    @RequestMapping("/guang")
    public List<Tcarouse> guang(@RequestBody Tcarouse tcarouse);

    @RequestMapping("/del")
    public void del(@RequestParam Integer siid);

    @RequestMapping("/huixian")
    public Tcarouse huixian(@RequestParam Integer siid);
}
