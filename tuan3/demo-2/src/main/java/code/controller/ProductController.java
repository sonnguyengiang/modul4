package code.controller;

import code.model.Product;
import code.services.IProductService;
import code.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;

    @RequestMapping("/show")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("home", iProductService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        System.out.println("1");
        ModelAndView modelAndView = new ModelAndView("/create");
        return modelAndView;
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Product product, @RequestParam MultipartFile upFile) {
        System.out.println("2");
        String nameMusic = upFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(upFile.getBytes(), new File("D:\\codegym\\module4\\tuan3\\demo-2\\src\\main\\webapp\\file\\" + nameMusic));
            String urlImg = "/i/file" + nameMusic;
            product.setImage(urlImg);
            System.out.println(urlImg);
        } catch (IOException e) {
            System.err.println("chưa uppload file");
        }
        iProductService.save(product);
        return "redirect:/show";
    }
}
