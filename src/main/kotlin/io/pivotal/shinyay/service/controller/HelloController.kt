package io.pivotal.shinyay.service.controller

import io.pivotal.shinyay.service.entity.Greeting
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class HelloController {

    val counter = AtomicLong()

    @RequestMapping("/")
    fun index() = "Access to '/greeting'"

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting =
            Greeting(counter.incrementAndGet(),"Hello, $name")
}