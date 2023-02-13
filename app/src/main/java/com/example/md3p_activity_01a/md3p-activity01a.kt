package com.example.md3p_activity_01a



import java.util.Random
data class Student(val id: Int, val name: String) {
    var grade: String? = null
    var nickname: String? = null
}

fun main() {
    println("MD3P Class Record")
    println()
    val students = mutableListOf(
        Student(1, "Alexander Chou"),
        Student(2, "Vic Amable"),
        Student(3, "John Cris Bolanio"),
        Student(4, "Aziza San Buenaventura"),
        Student(5, "Andrew Bustos"),
        Student(6, "Rizwan Caser"),
        Student(7, "Mark Andrei Condino"),
        Student(8, "Laurence de Dios"),
        Student(9, "Jerome Elenzano"),
        Student(10, "Noven Rey Gumnad"),
        Student(11, "Hanz Jaramillo"),
        Student(12, "Junzon Velasco"),
        Student(13, "ZR Lopez"),
        Student(14, "Vicyor Luzares"),
        Student(15, "Ryan Malacao"),
        Student(16, "Phil Manabat"),
        Student(17, "Ray Andrew Manila"),
        Student(18, "Dad Ivan Natividad"),
        Student(19, "Marie Fe Dela Peña"),
        Student(20, "Arthur Aldrin Ramos"),
        Student(21, "Emmanuel De Los Reyes"),
        Student(22, "Gretchen Roque"),
        Student(23, "Rey Brezuela Saliot"),
        Student(24, "Jeffrey Saltiga"),
        Student(25, "Rene Tajos"),
        Student(26, "Mark Taliman"),
        Student(27, "Jother Tirador"),
        Student(28, "Joe Mari Ubay"),
        Student(29, "Vince Ybañez"),
        Student(30, "Raffy Yalung")
    )

    students.forEach {
        print("Enter grade for ${it.name}:")
        var input = readLine()
        while (input != "pass" && input != "fail") {
            println("Invalid input. Please enter either 'pass' or 'fail':")
            input = readLine()
        }
        it.grade = input
    }

    students.forEach {
        it.nickname = generateNickname()
        println("ID: ${it.id}\n Name: ${it.name}\n grade: ${it.grade}\n Nickname: ${it.nickname}\n")
    }

}

fun generateNickname(): String {
    val random = Random()
    val adjectives = listOf("Smart", "Funny", "Brave", "Quiet", "Silly", "Nice")
    val animals = listOf("Tikbalang", "Kapre", "Tyanak", "Multo", "Engkanto", "Aswang")

    return "${adjectives[random.nextInt(adjectives.size)]} ${animals[random.nextInt(animals.size)]}"
}
