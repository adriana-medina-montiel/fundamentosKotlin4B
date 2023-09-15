fun main(){
    println("hello")
    sayHello()
    sayHelloTo("Yahir")
    sayHelloToFrom("bruyce Wayne",  "Gathan cityh")
    println("el doble de 25 es ${ duplicate(25)}")
    val result = divide(99,15.0)
    println("el resutaldo es:$result")
    println(fullName("john","Snow"))
    welcomeToMexico()
    welcomeToMexico("spiderman")

    sayHelloToFrom("piderman", "metropolis")
    sayHelloToFrom(city = "namekusai", name ="majinbu")

}
//funciones sin parametros y sin retorno

fun sayHello(){
    println("hello")

}
//funciones con parametros y sin retorno
fun sayHelloTo(name: String){
    println("hello $name")
    println("wElcome")

}
fun sayHelloToFrom(name: String,city: String){
    println("Helo $name from $city")
}

fun duplicate(num: Int): Int {
    return num * 2
}
fun divide(num1: Int, num2: Double): Double{
    return num1 / num2
}
fun fullName( firstName: String, lastName: String): String{
    return "$firstName $lastName"
}

fun welcomeToMexico(name: String ="Invitado"): Unit{
    println("Bienvenido a Mexico $name")
}