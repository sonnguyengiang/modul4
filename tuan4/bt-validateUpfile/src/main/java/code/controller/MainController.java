package code.controller;

import code.model.Music;
import code.services.MusicServices;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

@Controller
public class MainController {

    MusicServices musicServices = new MusicServices();

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("home", musicServices.list);
        return modelAndView;
    }

    @GetMapping("/delete/{index}")
    public ModelAndView delete(@PathVariable int index){
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        musicServices.delete(index);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("create", new Music());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@Valid @ModelAttribute("create") Music music, @RequestParam MultipartFile upFile, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("/create");
            return modelAndView;
        }
        String nameMusic = upFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(upFile.getBytes(), new File("D:\\codegym\\module4\\tuan4\\bt-validateUpfile\\src\\main\\webapp\\file\\" + nameMusic));
            String urlMusic = "/i/file/" + nameMusic;
            music.setFileMusic(urlMusic);
        } catch (IOException e) {
            System.err.println("chưa uppload file");
        }
        musicServices.save(music);
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        return modelAndView;
    }

}
