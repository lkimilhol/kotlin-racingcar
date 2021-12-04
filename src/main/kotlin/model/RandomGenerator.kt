package model

import model.Car.Companion.MIN
import model.Car.Companion.MAX

class RandomGenerator {
    companion object {
        fun exec(): Positive {
            val range = (MIN .. MAX)
            return Positive.create(range.random())
        }
    }
}