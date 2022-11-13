import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите 2 числа")
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    if(a>b) println("Большее =$a (a=$a; b=$b)")
    else if (a==b) println("Числа равны (a=$a; b=$b)")
        else println("Болшее=$b (a=$a; b=$b)")



}

