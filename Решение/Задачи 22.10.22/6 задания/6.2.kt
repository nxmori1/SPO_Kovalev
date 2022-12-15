import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextInt()
    val B =scanner.nextInt()
    if(A<B) {
        println("_________")
        for(N in A..B)
        {
            println("Число =$N на итерации= ${N-A+1}")// забыл как выводить итерацию
        }
    }
}