package com.andrew.learning.gof_patterns.state

class Car {
    var state: CarState

    init {
        state = EngineStopped(this)
    }

    fun startEngine() {
        state.startEngine()
    }

    fun accelerate() {
        state.accelerate()
    }

    fun brake() {
        state.brake()
    }

    fun stopEngine() {
        state.stopEngine()
    }

    fun setContextState(state: CarState) {
        this.state = state
    }
}
