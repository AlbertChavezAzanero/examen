package com.example.msvc_users.controller;

import com.example.msvc_users.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Calendar.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private Environment env;

    private Date createDate(int year, int month, int day){
        Calendar calendar = new GregorianCalendar();
        calendar.set(YEAR, year);
        calendar.set(MONTH, month - 1);
        calendar.set(DAY_OF_MONTH, day);
        return calendar.getTime();
    }

    @GetMapping
    public List<User> listUsers(){

        int currentPort = Integer.parseInt(env.getProperty("local.server.port"));

        return Arrays.asList(
                new User(1L, "76543210", "Carlos", "Vela", createDate(1989, 3, 5), currentPort),
                new User(2L, "12345678", "Sofia", "Mulanovich", createDate(1983, 6, 24), currentPort)
        );
    }
}