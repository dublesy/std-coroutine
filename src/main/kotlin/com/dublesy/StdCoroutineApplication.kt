package com.dublesy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StdCoroutineApplication

fun main(args: Array<String>) {
    runApplication<StdCoroutineApplication>(*args)
}
