package code.controller;

import code.model.FileMusic;
import code.services.IFileMusicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.MultipartFilter;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;

@Controller
public class MainController {

    @Autowired
    IFileMusicServices iFileMusicServices;

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("home", iFileMusicServices.findAll());
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable long id){
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        iFileMusicServices.delete(iFileMusicServices.findById(id));
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute FileMusic fileMusic, @RequestParam MultipartFile upFile) {
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        String nameMusic = upFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(upFile.getBytes(), new File("D:\\codegym\\module4\\tuan4\\bt-upFileNhac\\src\\main\\webapp\\file/" + nameMusic));
            String urlImg = "/i/file/" + nameMusic;
            fileMusic.setFile(urlImg);
        } catch (IOException e) {
            System.err.println("chưa uppload file");
        }
        iFileMusicServices.save(fileMusic);
        return modelAndView;
    }
}
