package com.andrew.learning.gof_patterns.state

abstract class CarState(
    val car: Car
) {
    abstract fun startEngine()
    abstract fun accelerate()
    abstract fun brake()
    abstract fun stopEngine()
}

class EngineStarted(car: Car) : CarState(car) {
    override fun startEngine() {
        println("Engine already started")
    }

    override fun accelerate() {
        car.setContextState(Accelerating(car))
        println("Started accelerating")
    }

    override fun brake() {
        println("Car is already stopped")
    }

    override fun stopEngine() {
        car.setContextState(EngineStopped(car))
        println("Engine stopped")
    }
}

class EngineStopped(car: Car) : CarState(car) {
    override fun startEngine() {
        car.setContextState(EngineStarted(car))
        println("Started engine")
    }

    override fun accelerate() {
        println("Cannot accelerate while engine is stopped")
    }

    override fun brake() {
        println("Car is already stopped")
    }

    override fun stopEngine() {
        println("Engine already stopped")
    }


}

class Accelerating(car: Car) : CarState(car) {
    override fun startEngine() {
        println("Engine already started")
    }

    override fun accelerate() {
        println("Car already accelerating")
    }

    override fun brake() {
        car.setContextState(Stopped(car))
        println("Car stopped")
    }

    override fun stopEngine() {
        println("Cannot accelerate while engine is stopped")
    }

}

class Stopped(car: Car) : CarState(car) {
    override fun startEngine() {
        println("Engine already started")
    }

    override fun accelerate() {
        car.setContextState(Accelerating(car))
        println("Started accelerating")
    }

    override fun brake() {
        println("Car already stopped")
    }

    override fun stopEngine() {
        car.setContextState(EngineStopped(car))
        println("Engine is stopped")
    }
}