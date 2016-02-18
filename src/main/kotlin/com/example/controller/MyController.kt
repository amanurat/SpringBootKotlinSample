package com.example.controller

import com.example.service.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class MyController {

    @Autowired
    private lateinit var messageService: MessageService

    @RequestMapping(value = "/", method = arrayOf(RequestMethod.GET))
    fun showIndex(model: Model): String {
        model.addAttribute("message", messageService.createMessage())
        return "index"
    }
}
