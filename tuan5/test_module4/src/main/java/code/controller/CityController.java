package code.controller;


import code.model.City;
import code.model.Country;
import code.service.ICityService;
import code.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class CityController {

    @Autowired
    ICityService iCityService;
    @Autowired
    ICountryService iCountryService;

    @ModelAttribute("countryList")
    public ArrayList<Country> countryList(){
        return iCountryService.findAll();
    }

    @RequestMapping("/home")
    public ModelAndView showHome(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("home", iCityService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("create", new City());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@Valid @ModelAttribute("create") City city, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ModelAndView("/create");
        }
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        iCityService.save(city);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable long id){
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        iCityService.delete(iCityService.findCityById(id));
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable long id){
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("edit", iCityService.findCityById(id));
        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public ModelAndView Edit(@ModelAttribute("edit") City city){
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        iCityService.edit(city);
        return modelAndView;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView showDetail(@PathVariable long id){
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("detail", iCityService.findCityById(id));
        return modelAndView;
    }
}
