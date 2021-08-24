package controller;

import model.Sandwich;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/view/home.jsp");
        modelAndView.addObject("sandwich", new Sandwich());
        modelAndView.addObject("nhanBanh", new String[]{"tomato","cheese","meat"});
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView save(@ModelAttribute("sandwich") Sandwich sandwich){
        ModelAndView modelAndView = new ModelAndView("/view/show.jsp");
        modelAndView.addObject("show",sandwich);
        return modelAndView;
    }

}
