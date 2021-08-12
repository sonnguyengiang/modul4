package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping("/show")
    public String show() {
        return "/WEB-INF/show.jsp";
    }

    @RequestMapping("/tinh")
    public String tinh(HttpServletRequest Request, @RequestParam int var1, @RequestParam String change) {
        float result = 0;
        System.out.println(var1);
        switch (change) {
            case "vn":
                result = var1 * 1;
                break;
            case "usd":
                result = var1 * 20;
                break;
        }
        Request.setAttribute("ketqua", result);
        return "/WEB-INF/show.jsp";
    }
}

