package model

import exception.BlankStringException
import exception.InvalidCarNamesException
import kotlin.streams.toList

class Game(private val carNames: String, private val cnt: Int) {
    private val cars: Cars

    fun play(): Winners {
        cars.move(cnt)
        return cars.winners()
    }

    private fun nameSplit(): Cars {
        val names = carNames.split(DELIMITER)
        return Cars(names.stream().map { Car(Positive.create(0), Name.create(it)) }
            .toList())
    }

    companion object {
        private const val DELIMITER = ","
    }

    init {
        if (carNames.isBlank()) {
            throw BlankStringException()
        }
        if (!carNames.contains(DELIMITER)) {
            throw InvalidCarNamesException()
        }
        cars = nameSplit()
    }
}