package zabolotniy.volodymyr.designpatterns.kotlin_command

import org.junit.jupiter.api.Test

class OrderCommandTest {

    @Test
    fun `should process order commands`() {
        OrderProcessor()
            .addToQueue(OrderAddCommand(1L))
            .addToQueue(OrderAddCommand(2L))
            .addToQueue(OrderPayCommand(2L))
            .addToQueue(OrderPayCommand(1L))
            .processCommands()
    }
}
