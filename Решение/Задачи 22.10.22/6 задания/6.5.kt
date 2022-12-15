import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextInt()
    val B =scanner.nextInt()
    if(A<B) {
        println("_________")
        var proiz = 1
        for (N in A..B)
        {
            proiz*=N
        }
        println(proiz)
    }
}