package com.corposense.demo

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@CompileStatic
class HelloController {

    @GetMapping('/')
    @ResponseBody
    def hello(){
        'Hello Spring Boot!'
    }

}
