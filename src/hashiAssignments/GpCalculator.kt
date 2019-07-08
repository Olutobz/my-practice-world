package hashiAssignments

import java.util.Scanner

//method main begins program execution
fun main(args: Array<String>) {
    val input = Scanner(System.`in`) //program uses class scanner

    println("\n>>>>> INITIALIZING SEMESTER GP CALCULATOR <<<<<<\n")
    print("What session are you currently in?: ")
    val session = input.next()

    print("What is your current semester (Harmattan/Rain)? ")
    val semester = input.next()

    print("Enter number of courses :? ")
    val noOfCourses = input.nextInt()

    val allCourses = arrayOfNulls<Course>(noOfCourses)

    println("\nPlease enter the details for each course below: ")

    for( i in 0 until allCourses.size){
        print("What is the course code for this course? ")
        val courseCode = input.next()

        print("What is the number of units for $courseCode? ")
        val noOfUnits = input.nextInt()

        print("What is your score for $courseCode? ")
        val score = input.nextInt()

        println() //a white space line is printed

        allCourses[i] = Course(courseCode, noOfUnits, score)
    } //end for

    var tcp = 0.0
    var tnu = 0

    for(i in 0 until allCourses.size){
        tcp += allCourses[i]!!.getPoint()
        tnu += allCourses[i]!!.getTotalUnits()
    }

    val gp: Double
    gp = tcp/tnu

    println("Your GPA for $semester semester in $session session is ==> $gp")


} //end method main

