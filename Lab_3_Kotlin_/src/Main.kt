fun main() {
    // Пример экземпляра книги!
    val book1 = Book("Программирование на Kotlin", 300, 1500.0)
    println(book1.getInfo())
    println("An average cost per sheet: ${book1.averageSheetPrice()}")

    book1.startsWith()
    println("After the possible price changing: ${book1.getInfo()}")

    println("_____________")

    try{
    println("Enter the title of the book: ")
    val title = readLine() ?: "Unknown book!"
    println("Enter the count of the sheets: ")
    val pageCount = readLine()?.toIntOrNull() ?: 0
    println("Enter the cost of the book: ")
    val price = readLine()?.toDoubleOrNull() ?: 0.0

    val book2 = Book(title, pageCount, price)
    println(book2.getInfo())
    println("An average cost per sheet: ${book2.averageSheetPrice()}")


    book2.startsWith()
    println("After the possible price changing: ${book2.getInfo()}")}

     catch(e: Exception){ println("Error: ${e.message}")
        println("Please try again!")}

    System.gc()
}
