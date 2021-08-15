package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import services.CustomerServices;

@Controller
public class MainController {
    CustomerServices customerServices = new CustomerServices();

    @RequestMapping("/show")
    public String show(Model mode){
        mode.addAttribute("customerList", customerServices.list);
        return "/WEB-INF/views/show";
    }

}
