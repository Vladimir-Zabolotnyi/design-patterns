package zabolotniy.volodymyr.designpatterns.kotlin_facade

class UserRepository {

    private val systemPreferences = ComplexSystemStore("data/default.prefs")

    fun save(user: User) {
        systemPreferences.store("USER_KEY", user.login)
        systemPreferences.commit()
    }

    fun findFirst(): User =
        User(systemPreferences.read("USER_KEY"))
}
