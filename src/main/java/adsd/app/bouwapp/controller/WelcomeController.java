package adsd.app.bouwapp.controller;


import adsd.app.bouwapp.repository.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {


    @Autowired
    ServiceDao serviceDao;


    @RequestMapping("/welcome")

    public String welcome (Model model)
    {
        model.addAttribute("test","testAttribute");
        model.addAttribute("lijst",serviceDao.findAllGrondstoffen());

        return "welcome";
    }


    @RequestMapping("/login")

    public String login (Model model)
    {

       if(serviceDao.findUser(9)==false ) {
           model.addAttribute("errorMessage", "wrong user name or password");
           return "welcome";
       }

        else
        {return "welcome";}
    }


}