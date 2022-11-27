fun main(args: Array<String>) {
    //replace first and last list element
    val list = arrayListOf<Int>(1, 2, 3, 4, 5)
    list.remove(list.size)
    list.add(list.size, 6)
    list.removeAt(0)
    list.add(0, 0)
    println(list)

    //replace all list elements to average of these elements
    val list2 = arrayListOf(1, 3, 5, 7, 9)
    val avr = list2.average()
    val i = 0
    for (i in i..list2.size-1){
        list2.removeAt(i)
        list2.add(i, avr.toInt())
    }
    println(list2)
}

