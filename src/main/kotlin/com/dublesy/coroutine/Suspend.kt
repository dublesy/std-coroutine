package com.dublesy.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * 병렬적 동작
 * coroutineScope 는 runBloking과 는 다르게 현재 의 스레드가 차단되지 않고 동작되는게 다름
 */

suspend fun main() {
    doSometing()
}

fun printHello() = println("hello")

suspend fun doSometing() = coroutineScope {
    launch {
        delay(200)
        println("world!")
    }

    launch {
        printHello()

    }

}