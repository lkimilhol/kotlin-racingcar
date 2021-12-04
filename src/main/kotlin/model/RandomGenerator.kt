package model

class RandomGenerator {
    companion object {
        private const val MIN = 0
        private const val MAX = 9

        fun create(): Int {
            val range = (MIN .. MAX)
            return range.random()
        }
    }
}