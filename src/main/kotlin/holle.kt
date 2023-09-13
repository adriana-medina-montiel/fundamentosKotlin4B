fun main() {
    println("hello world");
//variables
//val para declarar costantes (solo lectura)
    //var para variables
    val pi = 3.1416
    var x = 34

    println(pi)
    x = 24
    x = x + 1
    x++
    x--
    x += 10
    x -= 2
    x *= 2
    x /= 5
    println(x)

    val firstname = "medina"
    val lastname: String = "montiel"
    val fullname = firstname + " " + lastname
    println(fullname)

    val age: Int = 38
    val height: Double = 1.68
    var stars = 10
    //String templates
    //$ para imprimir variables
    // ${} para procesar antes de iprimir
    println("i'm $age years old")
    println("i'm $height de altura")
    println("Pbtendré ${stars + 10} estrellas")
}

