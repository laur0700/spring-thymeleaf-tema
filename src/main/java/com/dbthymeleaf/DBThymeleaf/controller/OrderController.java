package com.dbthymeleaf.DBThymeleaf.controller;

import com.dbthymeleaf.DBThymeleaf.dao.OrderDAO;
import com.dbthymeleaf.DBThymeleaf.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderDAO orderDAO;

    @GetMapping("{id}")
    public ModelAndView getOrderById(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("id-order");
        modelAndView.addObject("order", orderDAO.get(id));

        return modelAndView;
    }

    @GetMapping("all")
    public ModelAndView getAllOrders(){
        ModelAndView modelAndView = new ModelAndView("all-orders");
        modelAndView.addObject("orders", orderDAO.getAll());

        return modelAndView;
    }

    @PostMapping("add")
    public void addOrder(){
        Order order = new Order();
        order.setTimestamp(System.currentTimeMillis());
        orderDAO.create(order);
    }
}
