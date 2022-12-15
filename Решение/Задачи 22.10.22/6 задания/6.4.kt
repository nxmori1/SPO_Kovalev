import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextInt()
    val B =scanner.nextInt()
    if(A<B) {
        println("_________")
        var sum = 0
        for (N in A..B)
        {
            sum+=N
        }
        println(sum)
    }
}