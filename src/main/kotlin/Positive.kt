import exception.NegativeNumberException

data class Positive private constructor(val number: Int) {
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