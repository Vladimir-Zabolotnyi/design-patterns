package zabolotniy.volodymyr.designpatterns.kotlin_singleton

object SingletonPrintDriver {
    init {
        println("SingletonPrintDriver Initialization: $this")
    }

    fun print() =
        apply { println("Print: $this") }
}
