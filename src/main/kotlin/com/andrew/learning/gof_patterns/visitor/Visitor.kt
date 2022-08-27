package com.andrew.learning.gof_patterns.visitor

interface Visitor {
    fun visitDot(d: Dot)
    fun visitLine(line: Line)
    fun visitRectangle(rectangle: Rectangle)
}

class Build3dModelVisitor(val height: Int) : Visitor {
    override fun visitDot(d: Dot) {
        throw IllegalArgumentException("Visitor is not supported for Dot")
    }

    override fun visitLine(line: Line) {
        throw IllegalArgumentException("Visitor is not supported for Line")
    }

    override fun visitRectangle(rectangle: Rectangle) {
        println("Build a cuboid with height:$height, based on Rectangle: $rectangle")

    }
}

class ExportToJsonVisitor() : Visitor {
    override fun visitDot(d: Dot) {
        val jsonContent = """
        {
            "x": ${d.x},
            "y": ${d.y}
        }
        """.trimIndent()
       println("Export Dot as JSON: $jsonContent")
    }

    override fun visitLine(line: Line) {
        val jsonContent = """
        {
            "start": {
                "x": ${line.start.x},
                "y": ${line.start.y}
            },
            "end": {
                "x": ${line.end.x},
                "y": ${line.end.y}
            }
        }
        """.trimIndent()
        println("Export Line as JSON: $jsonContent")    }

    override fun visitRectangle(rectangle: Rectangle) {
        val jsonContent = """        
        {
            "topRight": {
                "x": ${rectangle.topRight.x},
                "y": ${rectangle.topRight.y}
            },
            "topLeft": {
                "x": ${rectangle.topLeft.x},
                "y": ${rectangle.topLeft.y}
            },
            "bottomLeft": {
                "x": ${rectangle.bottomLeft.x},
                "y": ${rectangle.bottomLeft.y}
            },
            "bottomRight": {
                "x": ${rectangle.bottomRight.x},
                "y": ${rectangle.bottomRight.y}
            },
        }
        """.trimIndent()
        println("Export Rectangle as JSON: $jsonContent")    }
}