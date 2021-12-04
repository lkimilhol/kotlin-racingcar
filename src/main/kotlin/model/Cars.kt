package model

data class Cars(private val cars: List<Car>) {
    fun move(tryCount: Int) {
        repeat(tryCount) {
            cars.stream()
                .map { it.move() }
        }
    }

    fun winners(): Winners {
        val temps = mutableListOf<Car>()
        for (car in cars) {
            checkWinner(car, temps)
        }
        return Winners(temps)
    }

    private fun checkWinner(car: Car, temps: MutableList<Car>) {
        if (temps.isEmpty()) {
            temps.add(car)
            return
        }

        if (car.isDraw(temps[0])) {
            temps.add(car)
            return
        }

        if (car.isWin(temps[0])) {
            temps.clear()
            temps.add(car)
        }
    }
}