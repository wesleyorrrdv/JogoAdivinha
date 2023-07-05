import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1,101)

    while (true){
        print("Digite um numero:")
        val guess = readLine()?.toIntOrNull()?: return
        if (guess == randomNumber){
            println("Parabens, você acertou!")
            break
        }else if (guess < randomNumber){
            println("Tente um numero menor.")
        }

    }

}