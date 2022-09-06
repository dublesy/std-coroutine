package com.dublesy.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking


fun main() = runBlocking<Unit> {
    val flow = simple()
    //리액티브 스트림과 같이 Terminal Operator(최종 연산자) 인 collect 를 호출하지 않으면 아 무런 일도 일어나지 않는다
    flow.collect {
        value -> println(value)
    }
}

fun simple() : Flow<Int> = flow {
    println("Flow Started")

    for(i in 1..3) {
        delay(100)
        emit(i)
    }

}