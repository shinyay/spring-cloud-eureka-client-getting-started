package io.pivotal.shinyay.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudEurekaClientGsApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudEurekaClientGsApplication>(*args)
}
