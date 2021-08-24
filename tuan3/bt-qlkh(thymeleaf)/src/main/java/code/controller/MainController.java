package code.controller;


import code.model.Customer;
import code.services.ICustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;


@Controller
public class MainController {
    @Autowired
    ICustomerServices iCustomerServices;

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("customer", iCustomerServices.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute Customer customer){
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        iCustomerServices.save(customer);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        iCustomerServices.Delete(id);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("edit", iCustomerServices.findByIndex(id) );
        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public ModelAndView edit(@ModelAttribute Customer customer, @PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        iCustomerServices.edit(id, customer);
        return modelAndView;
    }

}
