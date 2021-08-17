package controller;

import Services.MusicServices;
import model.Music;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;

@Controller
public class FileController {
    MusicServices musicServices = new MusicServices();

    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("music", musicServices.list);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView Create() {
        ModelAndView modelAndView = new ModelAndView("/create");
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Music music, @RequestParam MultipartFile upFile) {
        String nameMusic = upFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(upFile.getBytes(), new File("file:D:/codegym/module4/tuan2/bt-upfilenhac/src/main/webapp/file/" + nameMusic));
            String urlImg = "/i/file/" + nameMusic;
            music.setFileMusic(urlImg);
        } catch (IOException e) {
            System.err.println("chưa uppload file");
        }
        musicServices.save(music);
        return "redirect:/home";
    }
}
