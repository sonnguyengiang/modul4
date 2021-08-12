package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import services.CaculatorServices;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/show")
    public String home(HttpServletRequest request) {
        return "/WEB-INF/show.jsp";
    }

    @RequestMapping("/tinh")
    public String tinhketqua(HttpServletRequest request){
        int var1 = Integer.parseInt(request.getParameter("var1"));
        int var2 = Integer.parseInt(request.getParameter("var2"));
        String caculator = request.getParameter("maytinh");
        System.out.println(caculator);
        System.out.println(var1);
        CaculatorServices caculatorServices = new CaculatorServices();
        int ketqua = caculatorServices.caculator(var1, var2, caculator);
        request.setAttribute("caculatorx", ketqua);
        return "/WEB-INF/ketqua.jsp";
    }
}
