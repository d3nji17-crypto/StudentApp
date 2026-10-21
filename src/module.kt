class Module(private val code: String, private val name: String) {

    override fun toString(): String {
        return "$code: $name"
    }
}