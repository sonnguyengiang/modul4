package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/show")
    public String home(HttpServletRequest request) {
        return "/WEB-INF/show.jsp";
    }

    @RequestMapping("/tinh")
    public String tinhketqua(HttpServletRequest request, @RequestParam int var1, @RequestParam int var2){
        String caculator = request.getParameter("maytinh");
        String ketqua = "";
        switch (caculator){
            case "+":
                ketqua = String.valueOf(var1 + var2);
                break;
            case "-":
                ketqua = String.valueOf(var1 - var2);
                break;
            case "*":
                ketqua = String.valueOf(var1 * var2);
                break;
            case "/":
                if (var2 == 0){
                    ketqua = "khong the chia";
                } else {
                    ketqua = String.valueOf(var1 / var2);
                }
                break;
        }
        request.setAttribute("caculatorx", ketqua);
        return "/WEB-INF/show.jsp";
    }
}
