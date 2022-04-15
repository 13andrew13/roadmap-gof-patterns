package com.andrew.learning.gof_patterns.factory

import com.andrew.learning.gof_patterns.factory.domain.SportCarFactory
import com.andrew.learning.gof_patterns.factory.domain.UsualCarFactory

fun main() {
    val carType = "Sport"
    val carFactory = when (carType) {
        "Sport" -> SportCarFactory()
        "Usual" -> UsualCarFactory()
        else -> throw IllegalArgumentException("Not support car type $carType")
    }

    val engine = carFactory.createEngine()
    println("Engine description: ${engine.getDescription()}")
}