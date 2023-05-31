package zabolotniy.volodymyr.designpatterns.kotlin_command

class OrderPayCommand(
    private val id: Long,
) : OrderCommand {

    override fun execute() =
        println("Paying order id: $id")
}
