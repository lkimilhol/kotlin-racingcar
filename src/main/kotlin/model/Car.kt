package model

data class Car(var position: Positive, val name: Name) {
    fun move(randNum: Positive) {
        if (position.isMovable(randNum)) {
            position = position.go()
        }
    }

    fun isWin(target: Car): Boolean {
        return position.isGraterThan(target.position)
    }

    fun isDraw(target: Car): Boolean {
        return position == target.position
    }

    companion object {
        const val MIN = 0
        const val MAX = 9
    }
}