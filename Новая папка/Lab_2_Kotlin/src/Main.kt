fun main() {
    print("Введите натуральное число p: ")
    val input = readLine()

    // Проверяем, чтобы введенное значение не было null и его можно было привести к целому числу
    val p = input?.toIntOrNull()

    if (p != null && p > 0) {
        val result = findValidNumbers(p)
        println("Натуральные числа, не превосходящие $p, которые делятся на каждую из своих цифр: $result")
    } else {
        println("Пожалуйста, введите корректное натуральное число.")
    }
}

fun findValidNumbers(p: Int): List<Int> {
    val validNumbers = mutableListOf<Int>()

    for (i in 1..p) {
        if (isDivisibleByDigits(i)) {
            validNumbers.add(i)
        }
    }

    return validNumbers
}

fun isDivisibleByDigits(num: Int): Boolean {
    val digits = num.toString().map(Character::getNumericValue)

    for (digit in digits) {
        if (digit == 0 || num % digit != 0) {
            return false // Если цифра 0 или num не делится на цифру, возвращаем false
        }
    }

    return true
}
