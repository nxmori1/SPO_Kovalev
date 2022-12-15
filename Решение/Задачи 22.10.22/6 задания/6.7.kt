import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val N = scanner.nextInt()
    var fa=1.0
    if (N > 0)
    {
        for(I in 1..N) fa *= I
        println(fa)
    }
}