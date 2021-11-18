data class Name private constructor(val name: String){
    companion object {
        fun create(name: String): Name {
            validate(name)
            return Name(name)
        }

        private fun validate(name: String) {
            if (name.isEmpty()) {
                throw IllegalArgumentException("")
            }

            if (name.length > 5) {
                throw IllegalArgumentException("")
            }
        }
    }
}