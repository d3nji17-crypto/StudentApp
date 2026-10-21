open class Student(
    val id: String,
    protected val name: String,
    protected val course: String,
    protected val mark: Double
) {
    protected val modules: MutableList<Module> = mutableListOf()

    fun getGrade(): String {
        return when {
            mark >= 70 -> "First"
            mark >= 60 -> "2/1"
            mark >= 50 -> "2/2"
            mark >= 40 -> "Third"
            else -> "Fail"
        }
    }

    fun didPass(): Boolean {
        return mark >= 40
    }



    override fun toString(): String {
        return "ID: $id Name: $name Course: $course Mark: $mark"
    }
}