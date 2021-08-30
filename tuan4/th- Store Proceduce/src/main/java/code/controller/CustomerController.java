package code.controller;

import code.model.Customer;
import code.services.CustomerServices;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.validation.Valid;

@Controller
public class CustomerController {

    CustomerServices customerServices = new CustomerServices();

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("home", customerServices.list);
        return modelAndView;
    }

    @GetMapping("/delete/{index}")
    public ModelAndView delete(@PathVariable int index){
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        customerServices.delete(index);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("create", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@Valid @ModelAttribute Customer customer, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("/create");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        customerServices.save(customer);
        return modelAndView;
    }
}
