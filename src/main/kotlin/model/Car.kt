package model

data class Car(private var position: Positive, private val name: Name) {
    fun move() {
        if (isMovable(RandomGenerator.exec())) {
            position = position.go()
        }
    }

    fun isWin(target: Car): Boolean {
        return position.isGraterThan(target.position)
    }

    fun isDraw(target: Car): Boolean {
        return position == target.position
    }

    private fun isMovable(randNum: Positive): Boolean {
        return position.isGraterThan(randNum)
    }

    companion object {
        const val MIN = 0
        const val MAX = 9
    }
}