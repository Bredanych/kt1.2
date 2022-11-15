fun main() {
    val amount = 1000000
    val taxRate = 0.0075
    val taxValue = if (amount * taxRate <= 35) 35 else amount * taxRate
    println(taxValue)
}