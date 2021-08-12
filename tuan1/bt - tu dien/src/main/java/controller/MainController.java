package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String show(){
        return "/WEB-INF/home.jsp";
    }

    @RequestMapping("/tudien")
    public String test(HttpServletRequest request, @RequestParam String var){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("hello", "xin chao");
        hashMap.put("goodbye", "tam biet");
        request.setAttribute("ketqua", hashMap.get(var));
        return "/WEB-INF/home.jsp";
    }
}
