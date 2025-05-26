
class Book {

    private var _name: String = "Unknown book"
    private var _sheets: Int = 0
    private var _price: Double = 0.0

    constructor() {
        // Это конструктор по умолчанию, моё задание требовало по варианту его наличие

        this.name = "Unknown book"
        this.sheets = 0
        this.price = 0.0
    }

    constructor(title: String, pageCount: Int, price: Double) {
        this.name = title
        this.sheets = pageCount
        this.price = price
    }

    var name: String
        get() = _name
        set(value) {
            _name = value.trim()
        }

    var sheets: Int
        get() = _sheets
        set(value) {
            if (value >= 0) {
                _sheets = value
            } else {
                throw IllegalArgumentException("Number of sheets has to be positive Integer!")
            }
        }

    var price: Double
        get() = _price
        set(value) {
            if (value >= 0) {
                _price = value
            } else {
                throw IllegalArgumentException("Price has to be positive Double number!")
            }
        }

    fun averageSheetPrice(): Double {
        return if (this.sheets > 0) {
            this.price / this.sheets
        } else {
            println("The number of sheets in book has to be more than 0")
            -404.00
        }
    }

    fun startsWith() {
        if (this.name.startsWith("Программирование", ignoreCase = false)) {
            this.price *= 2
        }
    }

    fun getInfo(): String {
        return "Title: $name | Sheets: $sheets | Price: $price"
    }

    protected fun finalize() {
        println("Warning! The book '$name' was destructed!.")
    }
}
