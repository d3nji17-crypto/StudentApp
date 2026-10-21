class Student(val id: String, val name: String, val course: String, val mark: Double) {

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
        return mark <= 40
    }

    override fun toString(): String {
        return "Name: $name Course: $course Mark: $mark"
    }
}