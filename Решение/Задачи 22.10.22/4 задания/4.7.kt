import java.util.Scanner
import kotlin.math.pow
fun main() {
    val scanner = Scanner(System.`in`)
    println("ВВедите x=")
    val x = scanner.nextFloat()
    if (x<=0) println("f(x)=${-x}")
    if (x>0 && x<2) println("f(x)=${x.pow(2)}")
    if (x>=2) println("f(x)=4")                      //Тут просто принтанул(вроде x не нужно использовать)
}