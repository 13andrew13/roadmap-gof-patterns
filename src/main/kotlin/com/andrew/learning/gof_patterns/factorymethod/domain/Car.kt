package com.andrew.learning.gof_patterns.factorymethod.domain

abstract class Car {

    fun getMaxSpeed(): Int {
        val engine = getEngine()
        val transmission = getTransmission()
        val wheels = getWheels()

        return ((engine.getHorseAmount() * transmission.getSpeedRatio()) / wheels.getWheelFrictionRatio()).toInt()
    }

    fun getCarDescription(): String {

        val engine = getEngine()
        val transmission = getTransmission()
        val wheels = getWheels()

        return """
            Engine: ${engine.getDescription()},
            Transmission: ${transmission.getDescription()},
            Wheels: ${wheels.getDescription()}
            Max Speed: ${getMaxSpeed()}
        """.trimIndent()
    }

    abstract fun getEngine(): Engine

    abstract fun getTransmission(): Transmission

    abstract fun getWheels(): Wheels
}

class SportCar : Car() {
    override fun getEngine(): Engine = BiTurboEngine()
    override fun getTransmission(): Transmission = AutomaticTransmission()
    override fun getWheels(): Wheels = SportWheels()
}

class UsualCar : Car() {
    override fun getEngine(): Engine = BiTurboEngine()
    override fun getTransmission(): Transmission = AutomaticTransmission()
    override fun getWheels(): Wheels = SportWheels()
}
