fun main() {
    while (true) {
        print("Enter student name (or quit): ")
        val name = readln()!!

        // Stop the loop if the user typed quit
        if (name == "quit") {
            break
        }

        print("Enter student ID: ")
        val id = readln()!!

        print("Enter course: ")
        val course = readln()!!

        print("Enter mark: ")
        val mark = readln()!!.toDouble()   // toDouble() converts the String to a Double

        val student = Student(id, name, course, mark)
        println(student)
    }
}