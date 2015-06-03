package shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import shop.entity.User;


@Controller
public class HomeController {
    
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("login", "users", new User());
    }
    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String submit(@ModelAttribute("users")User user, 
       ModelMap model, BindingResult result) {
        model.addAttribute("userName", user.getUserName());
        model.addAttribute("password", user.getPassword());
        return "home";
    }
    }
	
	


