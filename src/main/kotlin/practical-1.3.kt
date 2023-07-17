fun main() {
    var a: Int = 10
    var b: Int = 12
    println("Ardeshna palak / 21012021006 ")
    println()
    println("using third variable")
    println("Before Swapping")
    println(a)
    println(b)
    var temp:Int = a
    a = b
    b = temp
    println("After Swapping")
    println(a)
    println(b)
    // Before Swapping
    println("without using third variable")
    println("Before Swapping")
    println(a)
    println(b)
    a += b
    b = a - b
    a -= b
    //After Swapping
    println("After Swapping")
    println(a)
    println(b)
}