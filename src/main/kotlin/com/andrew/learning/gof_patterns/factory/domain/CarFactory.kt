package com.andrew.learning.gof_patterns.factory.domain

abstract class CarFactory {

    abstract fun createEngine(): Engine

    abstract fun createTransmission(): Transmission

    abstract fun createWheels(): Wheels
}

class SportCarFactory : CarFactory() {
    override fun createEngine(): Engine = BiTurboEngine()
    override fun createTransmission(): Transmission = AutomaticTransmission()
    override fun createWheels(): Wheels = SportWheels()
}

class UsualCarFactory : CarFactory() {
    override fun createEngine(): Engine = BiTurboEngine()
    override fun createTransmission(): Transmission = AutomaticTransmission()
    override fun createWheels(): Wheels = UsualWheels()
}
