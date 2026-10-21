class University {
    private val modules: MutableList<Module> = mutableListOf()
    private val students: MutableList<Student> = mutableListOf()

    fun findStudentById(id: String): Student? {
        for (student in students) {
            if (student.id == id) {
                return student
            }
        }
        return null
    }

    fun enrolStudent(student: Student) {
        students.add(student)
    }

    fun findStudentsByName(name: String): MutableList<Student> {
        val matches = mutableListOf<Student>()
        for (student in students) {
            if (student.name == name) {
                matches.add(student)
            }
        }
        return matches
    }
}