package com.loni.joke.demo.controller;

import com.loni.joke.demo.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class JokeController {


    JokeService jokeService ;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

@RequestMapping({"/",""})
public String showJoke(Model model){
    model.addAttribute("joke", jokeService.getJoke());
    return "chucknorris";
    }

}
