package com.andrew.learning.gof_patterns.visitor

fun main() {
    // Shapes
    val dot = Dot(1, 2)
    val line = Line(start = Dot(2, 3), end = Dot(3, 4))
    val rectangle = Rectangle(
        topRight = Dot(3, 2),
        topLeft = Dot(1, 2),
        bottomLeft = Dot(1, 1),
        bottomRight = Dot(3, 1)
    )

    // Visitors
    val build3dModelVisitor = Build3dModelVisitor(4)
    val jsonVisitor = ExportToJsonVisitor()

    // Should throw exception dot and line build 3d model
    try {
        dot.accept(build3dModelVisitor)
    } catch (e: IllegalArgumentException) {
        println("Exception for Dot catch")
    }
    try {
        line.accept(build3dModelVisitor)
    } catch (e: IllegalArgumentException) {
        println("Exception for Line catch")
    }

    // Should proceed with 3d model for rectangle
    rectangle.accept(build3dModelVisitor)

    // Should accept Json Visitor for all Shapes
    dot.accept(jsonVisitor)
    line.accept(jsonVisitor)
    rectangle.accept(jsonVisitor)
}