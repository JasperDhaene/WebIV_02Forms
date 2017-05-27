package controller;

import domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/account")
public class AccountController {

    @RequestMapping(method = RequestMethod.GET)
    public String showHomePage(Model model) {
        model.addAttribute("account", new Account());
        return "accountForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(
            @ModelAttribute("account") Account account, Model model) {
        
        account.simpleExample();
        return "exampleView";
    }
    
}
