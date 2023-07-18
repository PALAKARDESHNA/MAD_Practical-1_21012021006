import java.util.Scanner
import javax.print.DocFlavor.READER

fun main(){
    println("ardeshna palak/21012021006")
    println("enter the number:14")
    var reader = Scanner(System.`in`)
    var x : Int = reader.nextInt()
    when(x){
        1-> println("jANUARY")
        2-> println("february")
        3-> println("march")
        4-> println("april")
        5-> println("may")
        6-> println("june")
        7-> println("july")
        8-> println("august")
        9-> println("sepetember")
        10-> println("october")
        11-> println("november")
        12-> println("december")
        else-> println(" not found ")
    }
}