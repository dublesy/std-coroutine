package com.dublesy.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


fun main() = runBlocking<Unit> {
//    launch {
//        delay(500) // 스레드를 차단하지 않고 일시중단, 블로킹 없이 동작
//        //Thread.sleep(500) // 블로킹
//        println("world")
//    }
//    println("hello")

    val job1: Job = launch {
        val elapsedTime = measureTimeMillis {
            delay(150)
        }
        println("async task-1 $elapsedTime ms")
    }
    job1.cancel()
    val job2: Job = launch(start = CoroutineStart.LAZY) {
        val elapsedTime = measureTimeMillis {
            delay(100)
        }
        println("async task-2 $elapsedTime ms")
    }
    println("start task-2")
    job2.start()
}