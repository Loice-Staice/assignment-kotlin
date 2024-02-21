fun main(){
    val name = "Loice"
    printHello(name)
    var x =modulus(9,4)
    println(x)


    var y =result(4,8,10,8)
    println(y)

    val string ="I love reading novels"
    val sentence="$string"
    println(sentence)
    //output

}

fun printHello (name:String){
    println("Hello $name")
}

fun modulus(num1: Int,num2: Int){
    var remainder = num1 % num2
    println(remainder)
}

fun result(num1: Int,num2: Int, num3: Int, num4: Int): Int{
    var result = num1 + num2 +num3 +num4
    return (result)
}