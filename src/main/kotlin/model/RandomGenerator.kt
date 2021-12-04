package model

import model.Car.Companion.MIN
import model.Car.Companion.MAX

class RandomGenerator {
    companion object {
        fun exec(): Int {
            val range = (MIN .. MAX)
            return range.random()
        }
    }
}