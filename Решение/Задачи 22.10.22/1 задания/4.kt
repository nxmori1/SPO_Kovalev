import java.util.Scanner
import kotlin.math.pow
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите стороны a")
    val a= scanner.nextInt()
    val V=a.toFloat().pow(3)
    println("V = $V")

}
