package zabolotniy.volodymyr.designpatterns.kotlin_command

class OrderProcessor {

    private val queue = ArrayList<OrderCommand>()

    fun addToQueue(command: OrderCommand) =
        apply {
            queue.add(command)
        }

    fun processCommands() =
        apply {
            queue.forEach(OrderCommand::execute)
            queue.clear()
        }
}
