// Одномерный массив
//fun main() {
//
//    println("Введите количество элементов массива:")
//    val size = readLine()?.toIntOrNull() ?: return
//
//
//    val numbers = IntArray(size)
//
//
//    println("Введите $size целых чисел:")
//    for (i in numbers.indices) {
//        numbers[i] = readLine()?.toIntOrNull() ?: return
//    }
//
//    // а) Проверка: сумма элементов, которые больше 20, превышает 100
//    val sumGreaterThan20 = numbers.filter { it > 20 }.sum()
//    val isSumGreaterThan100 = sumGreaterThan20 > 100
//    println("Сумма элементов, которые больше 20: $sumGreaterThan20")
//    println("Сумма элементов, которые больше 20 превышает 100: $isSumGreaterThan100")
//
//    // б) Проверка: сумма элементов, которые меньше 50 - четное число
//    val sumLessThan50 = numbers.filter { it < 50 }.sum()
//    val isSumEven = sumLessThan50 % 2 == 0
//    println("Сумма элементов, которые меньше 50: $sumLessThan50")
//    println("Сумма элементов, которые меньше 50 четное число: $isSumEven")
//}







// Двумерный массив
fun main() {
    val numEmployees = 18
    val numMonths = 12


    val salaries = Array(numEmployees) { IntArray(numMonths) }

    // Ввод зарплат для каждого сотрудника за каждый месяц
    for (i in 0 until numEmployees) {
        println("Введите зарплату для сотрудника ${i + 1} за каждый месяц:")
        for (j in 0 until numMonths) {
            print("Месяц ${j + 1}: ")
            salaries[i][j] = readLine()?.toIntOrNull() ?: 0 // Установим 0, если ввод некорректен
        }
    }


    var totalSalary = 0
    for (i in 0 until numEmployees) {
        for (j in 0 until numMonths) {
            totalSalary += salaries[i][j]
        }
    }

    // Вывод общей зарплаты
    println("Общая зарплата, выплаченная за год всем сотрудникам: $totalSalary")
}

