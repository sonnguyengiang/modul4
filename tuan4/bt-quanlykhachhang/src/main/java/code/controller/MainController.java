package code.controller;

import code.model.Customer;
import code.repository.ICustomerRepo;
import code.services.ICustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    ICustomerServices iCustomerServices;

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("home", iCustomerServices.findAll());
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable long id){
        ModelAndView mainController = new ModelAndView("redirect:/home");
        iCustomerServices.delete(iCustomerServices.findById(id));
        return mainController;
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

}
