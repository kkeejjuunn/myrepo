package com.example.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {GET, POST, PUT, DELETE, OPTIONS})
public class MyController {

    @GetMapping("/hello")
    public String helloWorld(Model model) {
        Random random = new Random();
        List<String> quotes = new ArrayList<>();
        quotes.add("Logic will get you from A to B. Imagination will take you everywhere.");
        quotes.add("There are 10 kinds of people. Those who know binary and those who don't.");
        quotes.add("There are two ways of constructing a software design. One way is to make it\n" +
                "so simple that there are obviously no deficiencies and the other is to make\n" +
                "it so complicated that there are no obvious deficiencies.");
        quotes.add("It's not that I'm so smart, it's just that I stay with problems longer.");
        quotes.add("It is pitch dark. You are likely to be eaten by a grue.");

        int randomIndex = random.nextInt(quotes.size());

        String quote = quotes.get(randomIndex);
        model.addAttribute("quote",quote);

        return "index";
    }
}
