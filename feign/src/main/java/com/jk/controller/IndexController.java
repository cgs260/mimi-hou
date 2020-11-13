package com.jk.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping("/china")
    public String china(){
        return "index";
    }

    @RequestMapping("page/toLogin")
    public String tologin(){
        return "login";
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/queryOrder")
    @RequiresPermissions("ding:query")
    public String memberRankList() {
        return "cgs/china";
    }

    @RequestMapping("/goods/order")
    public String order(){
        return "order/orderList";
    }

    @RequestMapping("order/toSaveOrder")
    public String toSaveOrder(){
        return "order/saveOrder";
    }

    @RequestMapping("highcharts")
    public String highcharts(){
        return "highcharts";
    }

}
