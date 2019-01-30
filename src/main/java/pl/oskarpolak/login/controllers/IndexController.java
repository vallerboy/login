package pl.oskarpolak.login.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.oskarpolak.login.models.services.UserSession;

@Controller
public class IndexController {

    final UserSession userSession;

    @Autowired
    public IndexController(UserSession userSession) {
        this.userSession = userSession;
    }

    @GetMapping("/")
    @ResponseBody
    public String index() {
        if(userSession.isUserLogin()){
            return "Tajny content! Widoczny tylko dla zalogowanych!";
        }
        return "WYPAD!";
    }

}
