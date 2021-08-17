package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import services.CustomerServices;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {
    CustomerServices customerServices = new CustomerServices();
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("customer", customerServices.list);
        return "/home";
    }

    @GetMapping("/create")
    public String create() {
        return "/create";
    }

    @PostMapping("/create")
    public String Create(@ModelAttribute("customer") Customer customer) {
        customerServices.save(customer);
        return "/home";
    }
}
