package com.example

import com.example.service.HelloMessageService
import com.example.service.MessageService
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class DemoApplication {

    //openにしないとエラー
    @Bean
    open fun messageService(): MessageService = HelloMessageService()
}

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}
