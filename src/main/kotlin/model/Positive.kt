package model

import exception.NegativeNumberException

data class Positive private constructor(private val number: Int) {
    fun isGraterThan(positive: Positive): Boolean {
        return number > positive.number
    }

    fun go(): Positive {
        return Positive(number + 1)
    }

    fun isMovable(randNum: Positive): Boolean {
        return Game.MOVABLE_NUMBER <= randNum.number
    }

    fun number(): Int {
        return number
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
