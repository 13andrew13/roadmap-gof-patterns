package com.andrew.learning.gof_patterns.factorymethod.domain

interface Wheels {
    fun getWheelFrictionRatio(): Float
    fun getDescription(): String
}

class UsualWheels: Wheels{
    override fun getWheelFrictionRatio(): Float = 2.3F
    override fun getDescription(): String = "Usual wheels"
}

class SportWheels: Wheels{
    override fun getWheelFrictionRatio(): Float = 1.2F
    override fun getDescription(): String = "Sport wheels"
}