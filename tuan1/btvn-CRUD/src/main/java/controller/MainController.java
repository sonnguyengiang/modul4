package controller;

import dao.CRUD_customer;
import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import services.CustomerServices;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@Controller
@RequestMapping("/customer")
public class MainController {
    CustomerServices customerServices = new CustomerServices();

    @RequestMapping("/show")
    public String show(HttpServletRequest request){
        request.setAttribute("customerList", customerServices.list);
        return "/WEB-INF/show.jsp";
    }

    @GetMapping("/create")
    public String create(){
        return "/WEB-INF/create.jsp";
    }

    @PostMapping("/create")
    public void create(@ModelAttribute Customer customer, HttpServletResponse response) throws IOException {
        customerServices.create(customer);
        response.sendRedirect("/customer/show");
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int index){
        customerServices.delete(index);
        return "redirect:/customer/show";
    }

    @GetMapping("/edit")
    public String edit(HttpServletRequest request ,@RequestParam int index){
        request.setAttribute("listEdit", customerServices.list.get(index));
        return "/WEB-INF/edit.jsp";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Customer customer, @RequestParam int index){
        System.out.println(index);
        customerServices.edit(customer, index);
        return "redirect:/customer/show";
    }

    @PostMapping("/find")
    public String find(HttpServletRequest request, @RequestParam String findName){
        ArrayList<Customer> list = new ArrayList<>();
        try {
            list = CRUD_customer.find(findName);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        request.setAttribute("customerList",list);
        return "/WEB-INF/show.jsp";
    }
}
