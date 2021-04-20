package main

fun main(){
    val num = 4
    println(multiplyDigits(num))
}

fun multiplyDigits(num: Int) : Int{
    var result = 1
    var timesMultiplied = 1
    var digits = castDigitsToChar(num)

    val checkResult = checkIfHasMoreThanOneDigit(num)

    when(checkResult){
        true -> do {
            for (i in digits.indices){
                val numericInt = Character.getNumericValue(digits[i])
                result *= numericInt
            }

            val checkResult = checkIfHasMoreThanOneDigit(result)
            if (checkResult) {
                digits = castDigitsToChar(result)
                result = 1
                timesMultiplied++
            }

        }while(checkResult)
        false -> timesMultiplied = 0
    }

    return timesMultiplied
}

fun checkIfHasMoreThanOneDigit(result : Int) : Boolean {
    val digitsResult = castDigitsToChar(result)
    return digitsResult.size > 1
}

fun castDigitsToChar(num : Int) : CharArray{
    return num.toString().toCharArray()
}

// Outra solução
fun persistence(num: Int) = generateSequence(num) {
    it.toString().map(Character::getNumericValue).reduce {
            mult, element -> mult * element
    }
}.takeWhile {
    it > 9
}.count()