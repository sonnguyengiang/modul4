package codegym.controller;

import codegym.model.Account;
import codegym.services.IAccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

    @Autowired
    IAccountServices iAccountServices;

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("home", iAccountServices.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute Account account){
        iAccountServices.save(account);
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable long id){
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("edit", iAccountServices.findById(id));
        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public ModelAndView edit(@ModelAttribute Account account){
        iAccountServices.edit(account);
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable long id){
        iAccountServices.Delete(iAccountServices.findById(id));
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        return modelAndView;
    }
}
