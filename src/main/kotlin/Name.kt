import exception.EmptyNameException
import exception.TooLongNameException

data class Name private constructor(val name: String){
    companion object {
        private const val NAME_LENGTH = 5

        fun create(name: String): Name {
            validate(name)
            return Name(name)
        }

        private fun validate(name: String) {
            if (name.isEmpty()) {
                throw EmptyNameException()
            }

            if (name.length > NAME_LENGTH) {
                throw TooLongNameException()
            }
        }
    }
}