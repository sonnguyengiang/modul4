package code.controller;

import code.model.Gmail;
import code.services.GmailServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GmailController {
    GmailServices gmailServices = new GmailServices();

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/home");
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView save(@ModelAttribute Gmail gmail){
        ModelAndView modelAndView = new ModelAndView("redirect:/show");
        gmailServices.save(gmail);
       return modelAndView;
    }

    @GetMapping("/show")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView("/show");
        modelAndView.addObject("hienthi", gmailServices.list);
        return modelAndView;
    }
}
