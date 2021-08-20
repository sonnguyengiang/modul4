package controller;

import model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import repository.IBlogRepo;
import services.IBlogServices;

import java.util.ArrayList;

@Controller
public class MainController {
    ArrayList<Blog> list = new ArrayList<>();

    @Autowired
    IBlogServices iCustomerServices;


    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/home");
        list = iCustomerServices.findAll();
        modelAndView.addObject("blog", list);
        return modelAndView;
    }

    @GetMapping("/detail/{index}")
    public ModelAndView showDetail(@PathVariable int index) {
        return new ModelAndView("/detail", "detailBlog", list.get(index));
    }

    @GetMapping("/delete/{index}")
    public String delete(@PathVariable int index) {
        iCustomerServices.Delete(list.get(index));
        return "redirect:/home";
    }

    @GetMapping("/create")
    public String create(){
        return "/create.html";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog){
        iCustomerServices.save(blog);
        return "redirect:/home";
    }

    @GetMapping("/edit/{index}")
    public ModelAndView edit(@PathVariable int index){
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("edit", list.get(index));
        return modelAndView;
    }

    @PostMapping("/edit/{index}")
    public String edit(@RequestAttribute Blog blog){
        iCustomerServices.edit(blog);
        return "redirect:/home";
    }

    @GetMapping("/find")
    public ModelAndView find(@RequestParam String name){
        ModelAndView modelAndView = new ModelAndView("/home");
        iCustomerServices.findName(name);
        modelAndView.addObject("blog", list);
        return modelAndView;
    }
}
