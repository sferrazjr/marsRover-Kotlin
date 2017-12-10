package com.sf9000.marsRover

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
object MarsRoverServiceApplication {

    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(MarsRoverServiceApplication::class.java, *args)
    }
}
