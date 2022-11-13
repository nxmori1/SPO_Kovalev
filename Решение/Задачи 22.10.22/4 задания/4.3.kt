import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите 3 числа")
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val min:Int
    if (a>=b) min=a
        else if (b>=c) min=b
            else min=c
    println("Миним. число= $min (a=$a; b=$b; c=$c)")



}

