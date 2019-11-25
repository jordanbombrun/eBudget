package com.ebudget.application.controller;

import com.ebudget.application.Repository.AppliUserRepository;
import com.ebudget.application.model.AppliUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class AppliUserController {

    @Autowired
    AppliUserRepository appliUserRepository;

    @RequestMapping(value="", method = RequestMethod.POST)
    @ResponseBody
    public AppliUser postUser(AppliUser user) {
        return appliUserRepository.save(user);
    }

    @GetMapping(value="/all")
    @ResponseBody
    public String getAllUsers() {
        Iterable<AppliUser> listUsers = appliUserRepository.findAll();
        String returnString = "";
        for (AppliUser user : listUsers) {
            returnString += user.toString() + ", ";
        }
        return returnString;
    }


}
