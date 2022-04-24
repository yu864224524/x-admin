package cn.qqcn.common.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NotFoundController implements ErrorController{



    @RequestMapping("/error")
    public String error404(){
        return "error/404";
    }
}
