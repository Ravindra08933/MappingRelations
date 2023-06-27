package com.example.Controller;

import com.example.Service.CustomerService;
import com.example.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    CustomerService customerService;
    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value="/cust")
    public ModelAndView m1()
    {
        ModelAndView mav= new ModelAndView("home");
        return mav;
    }
    @PostMapping(value="/cust")
    public ModelAndView pm1(@ModelAttribute Customer customer)
    {
        Customer c=customerService.saveCustomer(customer);
        ModelAndView mav= new ModelAndView("home");
        mav.addObject("customer",c);
        return mav;
    }

}
