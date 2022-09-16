package rc.bootsecurity.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping("login")
    public String login(){return "login";}

    @GetMapping("about")
    @ResponseStatus(HttpStatus.OK)
    public String home(Model model){
        return "aboutUsPage";
    }

}
