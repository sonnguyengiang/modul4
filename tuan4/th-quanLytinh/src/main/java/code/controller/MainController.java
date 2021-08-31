package code.controller;

import code.model.Conscious;
import code.model.District;
import code.services.IConsciousServices;
import code.services.IDistrictServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class MainController {

    @Autowired
    IDistrictServices iDistrictServices;

    @Autowired
    IConsciousServices iConsciousServices;

    @ModelAttribute("consciousList")
    public ArrayList<Conscious> conscious(){
        return iConsciousServices.findAll();
    }

    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("home", iDistrictServices.findAll());
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable long id){
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        iDistrictServices.delete(iDistrictServices.findById(id));
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("districtList", new District());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create( @ModelAttribute("districtList") District district){
        iDistrictServices.save(district);
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        return modelAndView;
    }
}
