package zabolotniy.volodymyr.designpatterns.kotlin_singleton

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SingletonPrintDriverTest {

    @Test
    fun `should create singleton`() {
        // given
        print("Start")

        // when
        val printerFirst = SingletonPrintDriver.print()
        val printerSecond = SingletonPrintDriver.print()

        assertThat(printerFirst).isSameAs(SingletonPrintDriver)
        assertThat(printerSecond).isSameAs(SingletonPrintDriver)
    }
}
