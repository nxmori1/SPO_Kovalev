import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите 2 числа")
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var ma:Int
    if (a==b) {
        a=0
        b=0
        println("a=$a;b=$b")
    }
    else if (a>b) {
        ma=a
        println("Макс.=$ma a=$a;b=$b")}

        else {
            ma=b
            println("Макс.=$ma a=$a;b=$b")
    }


}

