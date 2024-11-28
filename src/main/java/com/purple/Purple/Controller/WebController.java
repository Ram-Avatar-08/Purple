package com.purple.Purple.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;





import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WebController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    
    

    @GetMapping("/Mylogin")
    public String login(){        
        return "login";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin/adminDashboard";
    }

    @GetMapping("/seller")
    public String seller(){
        return "seller/dashboard";
    }

}
