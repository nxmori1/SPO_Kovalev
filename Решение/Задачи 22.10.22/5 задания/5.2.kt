import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите тип взаимодействия с перменными 1-сложение, 2-вычитание, 3-умножение, 4-деление")
    val N = scanner.nextInt()
    println("Введите 1-ю перменную")
    val A = scanner.nextDouble()
    println("Введите 2-ю переменную")
    val B = scanner.nextDouble()
    if (B > 0|| B < 0) {
        when (N) {
            1 -> println(A + B)
            2 -> println(A - B)
            3 -> println(A * B)
            4 -> println(A / B)
            else -> println("Введите число от 1 до 4, для взаимодействия с перменными")
        }
    }else println("2-я переменная не может быть равна 0")
}