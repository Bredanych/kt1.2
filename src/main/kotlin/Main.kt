fun main() {
    //Задача номер 1
    val amount = 1000000
    val taxRate = 0.0075
    val minTax = 35
    val taxValue = if (amount * taxRate <= minTax) minTax else amount * taxRate
    println(taxValue.toString() + " - Ответ задачи №1")

    //Задача номер 2
    val likes = 221
    val people = if (likes % 100 != 11 && likes % 10 == 1) "человеку" else "людям"
    println("Понравилось " + likes + " " + people + " - Ответ задачи номер 2")

    //Задача номер 3
    val regUser = true
    val regUserDiscount = 1
    val priceValue = 1500
    val fixDiscount = 100
    val discount = 5
    val dPrice = if (priceValue < 1001) {
        priceValue
    } else if (priceValue >= 1001 && priceValue < 10001) {
        (priceValue - fixDiscount)
    } else if (priceValue >= 10001) {
        priceValue - (priceValue * discount/100)
    } else 0
    val resultPrice = if (regUser) (dPrice - (dPrice * regUserDiscount/100)) else dPrice
    println("Конечная цена : " + resultPrice + " - Ответ на задачу номер 3")
}