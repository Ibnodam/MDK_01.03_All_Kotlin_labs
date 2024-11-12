class Book {

    var name: String = ""
    var sheets: Int = 0
    var price: Double = 0.0

    constructor() {
        this.name = "Unknown book"
        this.sheets = 0
        this.price = 0.0
    }

    constructor(title: String, pageCount: Int, price: Double) {
        this.name = title
        this.sheets = pageCount
        this.price = price
    }

    fun averageSheetPrice(): Double {
        if(this.sheets > 0) return this.price / this.sheets
        else{
            println("The number of sheets in book has to be more than 0")
            return -404.00}
    }
    fun startsWith(){
        if(this.name.startsWith("Программирование", ignoreCase = false)) this.price *= 2
    }

    fun getInfo(): String{
        return "Title: $name | Sheets: $sheets | Price: $price"
    }

    protected fun finalize() {
        println("Warning! The book '$name' was destructed!.")
    }
}