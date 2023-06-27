package com.example.Controller;

import com.example.Service.CustomerService;
import com.example.Service.OrdersService;
import com.example.Service.OrdersServiceImpl;
import com.example.entity.Customer;
import com.example.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class OrdersController {

    OrdersService ordersService;
    @Autowired
    public void setOrdersService(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping(value="/order")
    public ModelAndView m1()
    {
        ModelAndView mav= new ModelAndView("home1");
        return mav;
    }
    @PostMapping(value="/order")
    public ModelAndView pm1(@ModelAttribute Orders orders)
    {
        Orders orders1 = ordersService.saveOrders(orders);
        ModelAndView mav= new ModelAndView("home1");
        mav.addObject("customer",orders1);
        return mav;
    }
}
