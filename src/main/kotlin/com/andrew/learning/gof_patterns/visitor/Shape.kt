package com.andrew.learning.gof_patterns.visitor

sealed interface Shape {
    fun draw()
    fun accept(v: Visitor)
}

data class Dot(val x: Int, val y: Int) : Shape {
    override fun draw() {
        println("Draw a dot with coordinate: $x, $y")
    }

    override fun accept(v: Visitor) {
        v.visitDot(this)
    }
}

data class Line(val start: Dot, val end: Dot) : Shape {
    override fun draw() {
        println("Draw a line with start at $start and end at $end")
    }

    override fun accept(v: Visitor) {
        v.visitLine(this)
    }
}

data class Rectangle(val topRight: Dot, val topLeft: Dot, val bottomLeft: Dot, val bottomRight: Dot) : Shape {
    override fun draw() {
        println("Draw a rectangle with top right: $topRight, top left: $topLeft, bottom left: $bottomLeft, bottom right: $bottomRight")
    }

    override fun accept(v: Visitor) {
        v.visitRectangle(this)
    }
}