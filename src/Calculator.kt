import java.util.Scanner

object Calculator {

    @JvmStatic
    fun main(args: Array<String>) {
        var done = false
        var selection: String
        val design = "******************"
        var num1: Int
        var num2: Int

        val scan = Scanner(System.`in`)

        println(design + '\n'.toString() + "Calculator" + '\n'.toString() + design)
        do {
            println("Choose to add, subtract, multiple, or divide")
            selection = scan.nextLine()

            println("Enter your first value: ")
            num1 = scan.nextInt()
            scan.nextLine()
            println("Enter your second value")
            num2 = scan.nextInt()
            scan.nextLine()

            if (selection.equals("add", ignoreCase = true) || selection.equals("addition", ignoreCase = true) || selection.equals("+", ignoreCase = true)) {
                add(num1, num2)
                println(add(num1, num2))
            } else if (selection.equals("subtract", ignoreCase = true) || selection.equals("subtraction", ignoreCase = true) || selection.equals("-", ignoreCase = true)) {
                subtract(num1, num2)
                println(subtract(num1, num2))
            } else if (selection.equals("divide", ignoreCase = true) || selection.equals("division", ignoreCase = true) || selection.equals("/", ignoreCase = true)) {
                division(num1, num2)
                println(division(num1, num2))
            } else if (selection.equals("multiply", ignoreCase = true) || selection.equals("multiplication", ignoreCase = true) || selection.equals("*", ignoreCase = true)) {
                multiply(num1, num2)
                println(multiply(num1, num2))
            } else {
                println("Error: Invalid entry")
            }

            println("Try again? (Y/N)")
            selection = scan.nextLine()
            if (selection.equals("N", ignoreCase = true) || selection.equals("No", ignoreCase = true)) {
                done = true
            }
        } while (!done)


    }

    fun add(x: Int, y: Int): Int {
        return x + y
    }

    fun subtract(x: Int, y: Int): Int {
        return x - y
    }

    fun division(x: Int, y: Int): Double {

        /*      Prints out the remainder if it is greater than 0
            int remainder = x % y;
            if(remainder > 0){
                System.out.println("Remainder: " + remainder);
            }*/
        return x.toDouble() / y
    }

    fun multiply(x: Int, y: Int): Int {
        return x * y
    }
}