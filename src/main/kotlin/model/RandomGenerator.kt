package model

import kotlin.random.Random

class RandomGenerator {
    companion object {
        fun create(): Int {
            val range = (1..10)
            return range.random()
        }
    }
}