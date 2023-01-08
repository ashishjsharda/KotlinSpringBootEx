package com.example.springbootkotlindemo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {
    @GetMapping("/")
    fun blog(model: Model): String {
        model.addAttribute("title", "Blog")
        model.addAttribute("posts", listOf(
            Post("Spring 5.0 goes GA", "Dear Spring community ..."),
            Post("Reactor Bismuth is out", "Lorem ipsum ..."),
            Post("Spring Data Kay-RC1", "Lorem ipsum ...")
        ))
        return "blog"
    }
}

