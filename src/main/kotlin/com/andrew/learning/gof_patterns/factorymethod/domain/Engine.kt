package com.andrew.learning.gof_patterns.factorymethod.domain

interface Engine {
    fun getDescription(): String
    fun getHorseAmount(): Int
}

class UsualAtmoEngine() : Engine {
    override fun getDescription(): String = "Usual engine"

    override fun getHorseAmount(): Int = 80
}

class TurboEngine() : Engine {
    override fun getDescription(): String = "Turbo V6"

    override fun getHorseAmount(): Int = 160
}

class BiTurboEngine() : Engine {
    override fun getDescription(): String = "BiTurbo V8"

    override fun getHorseAmount(): Int = 260

}

