package org.example.main.project.calculator

fun add(a: Int, b: Int) = a + b
fun sub(a: Int, b: Int) = a - b
fun multiply(a: Int, b: Int) = a * b
fun divide(a: Double, b: Double) =  if (b != 0.0) a / b else "Can't divide by zero"
fun square(a: Int) = a * a
fun cube(a: Int) = a * a * a

fun calculator() {
    println("Choose an operation: add, sub, multiply, divide, square, cube")
    val operation = readlnOrNull()?.lowercase()

    if (operation in listOf("add", "sub", "multiply", "square", "cube")) {
        print("Enter the first number: ")
        val num1 = readln().toInt()

        val result = when (operation) {
            "add", "sub", "multiply", "divide" -> {
                print("Enter the second number: ")
                val num2 = readln().toInt()

                when (operation) {
                    "add" -> add(num1, num2)
                    "sub" -> sub(num1, num2)
                    "multiply" -> multiply(num1, num2)
                    else -> 0
                }
            }
            "square" -> square(num1)
            "cube" -> cube(num1)
            else -> 0
        }

        println("Answer: $result")
    } else if (operation.equals("divide")) {
        print("Enter first number: ")
        val int1 = readln().toDouble()

        print("Enter second number: ")
        val int2 = readln().toDouble()

        println("Answer: ${divide(int1, int2)}")
    } else {
        println("Invalid operation selected!")
    }
}
