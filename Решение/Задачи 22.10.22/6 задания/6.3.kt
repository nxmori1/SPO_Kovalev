import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextInt()
    val B =scanner.nextInt()
    if(A<B) {
        println("_________")
        for(N in B downTo A)
        {
            println("Число =$N на итерации= ${B-N+1}")// забыл как выводить итерацию
        }
    }
}