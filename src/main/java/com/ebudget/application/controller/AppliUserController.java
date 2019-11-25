package com.ebudget.application.controller;

import com.ebudget.application.Repository.AppliUserRepository;
import com.ebudget.application.model.AppliUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class AppliUserController {

    @Autowired
    AppliUserRepository appliUserRepository;

    @PostMapping(value="")
    @ResponseBody
    public AppliUser postUser(@RequestBody AppliUser user) {
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
