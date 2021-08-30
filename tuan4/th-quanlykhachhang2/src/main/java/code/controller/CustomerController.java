package code.controller;

import code.model.Customer;
import code.services.ICustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    ICustomerServices iCustomerServices;

    @RequestMapping("/home")
    public ModelAndView home(@RequestParam(defaultValue = "0") int page) {
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("home", iCustomerServices.findAll(PageRequest.of(page, 5)));
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
        iCustomerServices.remove(iCustomerServices.findById(id));
        return modelAndView;
    }
}
