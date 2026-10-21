fun main() {
    val university = University()
    var choice = ""

    while (choice != "4") {
        println("1. Add a student")
        println("2. Search for student by ID")
        println("3. Search for students by name")
        println("4. Quit")
        print("Choice: ")
        choice = readln()

        if (choice == "1") {
            print("Enter ID: ")
            val id = readln()
            print("Enter name: ")
            val name = readln()
            print("Enter course: ")
            val course = readln()
            print("Enter mark: ")
            val mark = readln().toDouble()

            university.enrolStudent(Student(id, name, course, mark))
        } else if (choice == "2") {
            print("Enter ID: ")
            val found = university.findStudentById(readln())
            if (found != null) {
                println(found)
            } else {
                println("No student found with that ID")
            }
        } else if (choice == "3") {
            print("Enter name: ")
            val results = university.findStudentsByName(readln())
            if (results.isEmpty()) {
                println("No students found with that name")
            } else {
                for (student in results) {
                    println(student)
                }
            }
        }
    }
}