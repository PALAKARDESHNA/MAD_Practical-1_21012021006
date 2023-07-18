import sun.awt.geom.Crossings.EvenOdd
import java.util.Scanner

fun main(){
    println("ardeshnapalak / 21012021006")
    println("enter the number")
    var reader = Scanner(System.`in`)
    var a : Int = reader.nextInt()
    var evenOdd = if (a%2==0){
        println("number is even")
    }
    else{
        println("number is odd")
    }

}