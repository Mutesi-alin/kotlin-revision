//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    ]
    var name = arrayOf("aline","mutesi","jane","mum")
    name = name.plus("natalie")
    //adding array into array
    name=name.plus(arrayOf("natali","gaell","uwera","yuma"))
    println(name.contentToString())
    println(name.contentToString())
    // indexing operator
    println(name.indexOf("uwera"))
    // inbuit [max],null/min
    val statistics= arrayOf(12,34,76,78,90,34,14,23)
    println(statistics.minOrNull())
    val mut = Array(5){0}
    //???
    //length/size in array
    // count is function; referencing property
    //size is method;
    // to determine average
    println(statistics.average())
    println(statistics.count())
    println(statistics.sum().toDouble()/statistics.size)
    println(statistics.sum().toInt()/statistics.size)
    statistics.forEach {stat->
        println(stat*stat)

    }


    //sorting array;arranging in order; sorted array();
    var words = arrayOf("aline","mutesi","jane","mum")
    //for each index
    words.forEachIndexed() {idx,w->

        if(idx==1 || idx==2){
        }
        words= words.sortedArray()
        println(words.contentToString())

        //looping through array; printing each variable
        words.forEach { f ->}
}
