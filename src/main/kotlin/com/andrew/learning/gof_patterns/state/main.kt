package com.andrew.learning.gof_patterns.state


fun main() {
    val car = Car()

    car.startEngine()
    println("Engine is started? - ${car.state is EngineStarted}")

    car.accelerate()
    println("Car is accelerating? - ${car.state is Accelerating}")

    car.brake()
    println("Car is stopped? - ${car.state is Stopped}")

    car.stopEngine()
    println("Engine is stopped? - ${car.state is EngineStopped}")

    car.accelerate()
    println("Car is accelerating? - ${car.state is Accelerating}")
}
