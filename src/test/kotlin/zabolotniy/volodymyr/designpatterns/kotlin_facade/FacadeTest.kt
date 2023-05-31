package zabolotniy.volodymyr.designpatterns.kotlin_facade

import org.junit.jupiter.api.Test

class FacadeTest {

    @Test
    fun `should create singleton`() {
        // given
        val userRepository = UserRepository()
        val user = User("dbacinski")

        // when
        userRepository.save(user)

        // then
        val resultUser = userRepository.findFirst()
        println("Found stored user: $resultUser")
    }
}
