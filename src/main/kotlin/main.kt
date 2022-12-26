import java.lang.Integer.max


fun main() {
    val finalResult = comission("Mastercard", 27160, 600_020)
    when (finalResult) {
        -1 -> println("Limit excited")
        -2 -> println("Wrong type card")
        else -> println(finalResult)
    }
}

fun comission(cardType: String, amount: Int, amountMonth: Int): Int =
    when (cardType) {
        "Mastercard", "Maestro" ->
            when {
                amountMonth > 600_000 -> -1
                amountMonth > 75000 -> (((amount * 0.6) / 100) + 20).toInt()
                else -> 0
            }

        "VISA", "МИР" -> if (amountMonth > 600_000) -1 else max(35, ((amount * 0.75) / 100).toInt())
        "VKPay" -> 0
        else -> -2
    }










