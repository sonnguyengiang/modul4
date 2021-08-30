package controller;

import model.Music;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import services.MusicServices;

import java.io.File;
import java.io.IOException;

@Controller
public class MusicController {

    MusicServices musicServices = new MusicServices();

    @RequestMapping("/home")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("music", musicServices.list);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create(){
        ModelAndView modelAndView = new ModelAndView("/create");
        return modelAndView;
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Music music, @RequestParam MultipartFile upFile){
        String nameMusic = upFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(upFile.getBytes(),
                    new File("D:/codegym/module4/tuan3/bt-upFileNhac/src/main/webapp/file/" + nameMusic));
            String urlImg = "/file/" + nameMusic;
            music.setFileMusic(urlImg);
            System.out.println(urlImg);
        } catch (IOException e) {
            System.err.println("chưa uppload file");
        }
        musicServices.save(music);
        return "redirect:/home";
    }
}
