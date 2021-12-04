package model

import exception.NegativeNumberException

data class Positive private constructor(private val number: Int) {
    fun isGraterThan(positive: Positive): Boolean {
        return number > positive.number
    }

    fun go(): Positive {
        return Positive(number + 1)
    }

    companion object {
        fun create(number: Int): Positive {
            validate(number)
            return Positive(number)
        }

        private fun validate(number: Int) {
            if (number < 0) {
                throw NegativeNumberException()
            }
        }
    }
}
