fun main() {
//    // 1
//    print("Enter the size of the list: ")
//
//    val size: Int = readLine()!!.toInt()
//    var list: MutableList<Int> = mutableListOf()
//    for (i in 0 until size) {
//
//        print("Enter the $i's element: ")
//        list.add(readLine()!!.toInt())
//    }
//
//    var map: MutableMap<Int, Int> = mutableMapOf()
//
//    for(i in 0 until size){
//        for(ii in 0 until size){
//            if(i != ii && list[i] == list[ii]) map.put(list[i], list[ii])
//    }}


//////////////////////////////////

//    // 2
//    print("Enter the size of the first list: ")
//    val size_1 : Int = readLine()!!.toInt()
//    var list_1: MutableList<Int> = mutableListOf()
//    for (i in 0 until size_1) {
//        print("Enter $i's element: ")
//        list_1.add(readLine()!!.toInt())
//    }
//    print("Enter the size of the second list: ")
//    val size_2 : Int = readLine()!!.toInt()
//    var list_2: MutableList<Int> = mutableListOf()
//    for (i in 0 until size_2) {
//        print("Enter $i's element: ")
//        list_2.add(readLine()!!.toInt())
//    }
//    print("The number of common elements: ${list_1.intersect(list_2).sorted().size}. ${list_1.intersect(list_2).sorted()}")



    //////////////////////////////////




// 3
        print("Enter your text: ")
        val input = readLine() ?: ""


        val words = input
            .replace(Regex("[^a-zA-Zа-яА-Я0-9 ]"), "") // Удаляем знаки препинания
            .toLowerCase() // Приводим к нижнему регистру
            .split("\\s+".toRegex()) // Разбиваем строку на слова


        val wordCount = mutableMapOf<String, Int>()
        for (word in words) {
            if (word.isNotBlank()) { // Игнорируем пустые строки
                wordCount[word] = wordCount.getOrDefault(word, 0) + 1
            }
        }
        val minFrequency = wordCount.values.minOrNull()
        val rareWords = wordCount.filter { it.value == minFrequency }


        val result = rareWords.keys.minOrNull()


        if (result != null) {
            println("The word that is the most rarely used in the text: $result")
        } else {
            println("There were no word in the text.")
        }
    }