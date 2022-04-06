package com.dbthymeleaf.DBThymeleaf.controller;

import com.dbthymeleaf.DBThymeleaf.dao.CustomerDAO;
import com.dbthymeleaf.DBThymeleaf.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerDAO customerDAO;

    @GetMapping("{id}")
    public ModelAndView getCustomerById(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("id-customer");
        modelAndView.addObject("customer", customerDAO.get(id));

        return modelAndView;
    }

    @GetMapping("all")
    public ModelAndView getAllCustomers(){
        ModelAndView modelAndView = new ModelAndView("all-customers");
        modelAndView.addObject("customers", customerDAO.getAll());

        return modelAndView;
    }

    @GetMapping("filter-username/{username}")
    public ModelAndView filterByUsername(@PathVariable String username){
        ModelAndView modelAndView = new ModelAndView("all-customers");
        modelAndView.addObject("customers", customerDAO.filterByUsername(username));

        return modelAndView;
    }

    @GetMapping("filter-city/{city}")
    public ModelAndView filterByCity(@PathVariable String city){
        ModelAndView modelAndView = new ModelAndView("all-customers");
        modelAndView.addObject("customers", customerDAO.filterByCity(city));

        return modelAndView;
    }

    @GetMapping("filter-country/{country}")
    public ModelAndView filterByCountry(@PathVariable String country){
        ModelAndView modelAndView = new ModelAndView("all-customers");
        modelAndView.addObject("customers", customerDAO.filterByCountry(country));

        return modelAndView;
    }

    @PostMapping("add")
    public void addCustomer(@RequestBody Customer c){
        customerDAO.create(c);
    }
}
