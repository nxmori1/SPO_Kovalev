import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val N = scanner.nextInt()
    var s = 0.0
    if(N>0) {
        println("_________")
        for (I in 1..N) {
            s += 1 / I.toDouble()//Помог только гугл.(не понимал почему выводит 1)
            println(s)
        }
    }
}