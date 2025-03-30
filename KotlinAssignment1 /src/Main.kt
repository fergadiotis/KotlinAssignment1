/**
 * KotlinAssignment1
 *
 * This file contains solutions for the first Kotlin assignment, which includes:
 * - Sum of integers from 1 to a maximum value
 * - Factorial calculation (iterative, lambda, and recursive approaches)
 */

/**
 * A. Function that adds (sums) integers from 1 up to a specified maximum
 *
 * @param max The maximum integer to include in the sum
 * @return The sum of all integers from 1 to max
 * Using while loop (Alternative loop)
 */
fun sumUpTo(max: Int): Int {
    var sum = 0
    var i = 1
    while (i <= max) {
        sum += i
        i++
    }
    return sum
}

/**
 * B. Iterative function that finds the factorial of a specified integer
 *
 * @param n The integer to calculate factorial for
 * @return The factorial of n
 * Using when instead of if-else (more Kotlin-idiomatic):
 */
fun factorialIterative(n: Int): Long {
    if (n < 0) {
        throw IllegalArgumentException("Factorial is not defined for negative numbers")
    }

    var result: Long = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

/**
 * C. Lambda expression that finds the factorial of a specified integer
 *
 * @param n The integer to calculate factorial for
 * @return The factorial of n
 * Using Characteristics style
 */
val factorialLambda: (Int) -> Long = { n ->
    if (n < 0) {
        throw IllegalArgumentException("Factorial is not defined for negative numbers")
    }

    var result: Long = 1
    for (i in 1..n) {
        result *= i
    }
    result
}

/**
 * D. Recursive function that finds the factorial of a specified integer
 *
 * @param n The integer to calculate factorial for
 * @return The factorial of n
 */
fun factorialRecursive(n: Int): Long {
    require(n >= 0) { "Factorial is not defined for negative numbers" }

    return when (n) {
        0, 1 -> 1L
        else -> n * factorialRecursive(n - 1)
    }
}

/**
 * Main function to demonstrate the above functions
 */
fun main() {
    // Test the sum function
    val maxSum = 10
    println("Sum of integers from 1 to $maxSum: ${sumUpTo(maxSum)}")

    // Test the factorial functions with n = 5
    val n = 5

    println("\nFactorial of $n calculated using different approaches:")
    println("Iterative approach: ${factorialIterative(n)}")
    println("Lambda approach: ${factorialLambda(n)}")
    println("Recursive approach: ${factorialRecursive(n)}")
}