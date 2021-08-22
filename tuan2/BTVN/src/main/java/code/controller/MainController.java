package code.controller;

import code.model.Employee;
import code.services.IEmployeeServices;
import code.validate.ValidateUserName;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class MainController {
    @Autowired
    IEmployeeServices iEmployeeServices;

    @Autowired
    ValidateUserName validateUserName;

//    @RequestMapping("/home")
//    public ModelAndView home(@RequestParam(defaultValue = "0") int pageNumber, @RequestParam(defaultValue = "6") int sizePage) {
//        ModelAndView modelAndView = new ModelAndView("/home");
//        modelAndView.addObject("home", iEmployeeServices.findAllPage(PageRequest.of(pageNumber, sizePage)));
//        return modelAndView;
//    }

    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("home", iEmployeeServices.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("code",new Employee());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@Valid @ModelAttribute Employee employee, BindingResult bindingResult) {
//        ModelAndView modelAndView = new ModelAndView("redirect:/home");
//        iEmployeeServices.save(employee);
//        return modelAndView;

        validateUserName.validate(employee,bindingResult);
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("/create");
            modelAndView.addObject("code",employee);
            return modelAndView;
        }
        iEmployeeServices.save(employee);
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        iEmployeeServices.Delete(iEmployeeServices.findById(id));
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("edit", iEmployeeServices.findById(id));
        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public ModelAndView Edit(@ModelAttribute Employee employee) {
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        iEmployeeServices.edit(employee);
        return modelAndView;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView Edit(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("detail", iEmployeeServices.findById(id));
        return modelAndView;
    }

    @PostMapping("/findName")
    public ModelAndView find(@RequestParam String findName) {
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("home", iEmployeeServices.findAllByName(findName));
        return modelAndView;
    }

    @RequestMapping("/sapxep")
    public ModelAndView sapxep() {
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("home", iEmployeeServices.xapxep());
        return modelAndView;
    }

}
