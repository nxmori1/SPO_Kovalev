import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("ВВедите x=")
    val x = scanner.nextInt()
    if (x>0) println("${2*x}")
    else println("${6-x}")

}