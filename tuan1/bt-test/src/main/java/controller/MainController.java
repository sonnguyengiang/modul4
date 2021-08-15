package controller;

import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import services.ProductServices;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class MainController {
    ProductServices productServices = new ProductServices();

    @RequestMapping("/show")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("/show");
        modelAndView.addObject("productList", productServices.list);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("/create");
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product) {
        productServices.save(product);
        return "redirect:/show";
    }

    @GetMapping("/edit")
    public ModelAndView edit(@RequestParam int index) {
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("productEdit", productServices.list.get(index));
        return modelAndView;
    }

    @PostMapping("/edit")
    public String edit(@RequestParam int index, @ModelAttribute Product product) {
        productServices.edit(index, product);
        return "redirect:/show";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int index) {
        productServices.delete(index);
        return "redirect:/show";
    }

    @GetMapping("/find")
    public ModelAndView find(@RequestParam String findName) {
        ModelAndView modelAndView = new ModelAndView("/find");
        modelAndView.addObject("productFind", productServices.findByName(findName));
        return modelAndView;
    }

}
