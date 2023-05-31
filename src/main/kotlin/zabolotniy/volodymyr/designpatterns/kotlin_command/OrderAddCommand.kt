package zabolotniy.volodymyr.designpatterns.kotlin_command

class OrderAddCommand(
    private val id: Long,
) : OrderCommand {
    override fun execute() =
        println("Add order id: $id")
}
