package com.store.controller;

import com.store.mapper.UserMapper;
import com.store.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/mystore")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;


    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String getOrder(HttpServletRequest req,ModelMap model){
        String name = (String) req.getSession().getAttribute("name");
        model.addAttribute("orders",ordersService.selectOrder(name));
        model.addAttribute("total",ordersService.total(name));
        model.addAttribute("num",ordersService.getNum(name));
        return "orders";
    }
    @RequestMapping(value = "/order", method = RequestMethod.GET)//下单
    public String setOrder(HttpServletRequest req, HttpServletResponse resp, ModelMap model){
        String goodsName = req.getParameter("getT");
        String name = (String) req.getSession().getAttribute("name");
        double price = Double.parseDouble(req.getParameter("getP"));
        ordersService.order(goodsName,name,price);
        return "redirect:orders";
    }
    @RequestMapping(value = "/delOrder", method = RequestMethod.GET)
    public String delOrder(HttpServletRequest req){
        int id = Integer.parseInt(req.getParameter("getT"));
        ordersService.delOrder(id);
        return "redirect:orders";
    }

    @RequestMapping(value = "/finish", method = RequestMethod.GET)
    public String finishOrder(HttpServletRequest req){
        String userName = (String) req.getSession().getAttribute("name");
        ordersService.finish(userName);
        return "redirect:orders";
    }
}
