import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val a= scanner.nextInt()
    when(a)
    {
        1-> println("Понед.")
        2-> println("Вторник")
        3-> println("Среда")
        4-> println("Четверг")
        5-> println("Пятница")
        6-> println("Суббота")
        7-> println("Воскрес.")
        else -> println("Введите число от 1 до 10, чтобы получить результат")
    }
}