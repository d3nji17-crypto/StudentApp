fun main() {
    print("Enter the mark: ")
    val mark = readln().toDouble()

    val student = Student("1", "Denji", "Computing", mark)

    println("Mark: ${student.mark}")
    println("Grade: ${student.getGrade()}")
    println("Passed: ${student.didPass()}")
}