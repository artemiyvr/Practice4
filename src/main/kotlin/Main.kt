fun main(args: Array<String>) {
    /*
    Задание 1. Создал функцию printFullName, принимающую 2 строки: firstName и lastName.
    Использовал ее для вывода своего полного имени
     */
    fun printFullName(firstName: String, lastName: String) {
        println("$firstName $lastName");
    }
    printFullName("Артем", "Врачинский");
    /*
    Задание 2. Использовал именованные аргументы для вывода функции printFullName
     */
    printFullName(firstName = "Артем", lastName = "Врачинский");
    /*
    Задание 3. Создал функцию calculateFullName, которая возвращает полное имя в виде строки.
    Создал константу fullName со значением calculateFullName
     */
    fun calculateFullName(firstName: String, lastName: String): String {
        return "$firstName $lastName";
    }

    val fullName = calculateFullName("Артем", "Врачинский");
    /*
    Задание 4. Создал фукнцию calculateFullNameLength, которая возвращает Pair,
    содержащее полное имя и его длинну. Использовал функцию length для нахождения
    длины имени
     */
    fun calculateFullNameLength(firstName: String, lastName: String): Pair<String, Int>
    {
        val fullName = "$firstName $lastName";
        return Pair(fullName, fullName.length);
    }
    val fullNameLength = calculateFullNameLength("Артем", "Врачинский").second
    println(fullNameLength)
}
