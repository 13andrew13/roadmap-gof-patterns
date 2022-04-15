package com.andrew.learning.gof_patterns.factory.domain

interface Transmission {
    fun getDescription(): String
    fun getSpeedRatio(): Float
}

class MechanicTransmission : Transmission {
    override fun getDescription(): String = "Mechanic Transmission"
    override fun getSpeedRatio(): Float = 1F
}

class AutomaticTransmission : Transmission {
    override fun getDescription(): String = "Automatic Transmission"
    override fun getSpeedRatio(): Float = 1.2F
}