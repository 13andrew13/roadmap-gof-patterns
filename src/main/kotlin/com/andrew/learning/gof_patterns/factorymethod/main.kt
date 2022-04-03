package com.andrew.learning.gof_patterns.factorymethod

import com.andrew.learning.gof_patterns.factorymethod.domain.SportCar
import com.andrew.learning.gof_patterns.factorymethod.domain.UsualCar

fun main(args: Array<String>) {
    val carType = if (args.size > 0) args[0] else "Sport"
    val car = factoryMethod(carType)
    println(car.getCarDescription())
}

fun factoryMethod(carType: String) =
    when (carType) {
        "Sport" -> SportCar()
        "Usual" -> UsualCar()
        else -> throw IllegalArgumentException("Not supported car: $carType")
    }