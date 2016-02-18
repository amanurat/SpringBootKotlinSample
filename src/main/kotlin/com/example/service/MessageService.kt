package com.example.service

interface MessageService {

    fun createMessage(): String
}

class HelloMessageService : MessageService {
    override fun createMessage(): String = "Hello"
}
