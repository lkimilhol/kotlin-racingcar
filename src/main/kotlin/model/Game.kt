package model

import exception.BlankStringException
import exception.InvalidCarNamesException
import kotlin.streams.toList

class Game(private val carNames: String, private val cnt: Int) {
    val cars: Cars
    lateinit var winners: Winners

    fun play() {
        cars.move(cnt)
        winners = cars.winners()
    }

    private fun nameSplit(): Cars {
        val names = carNames.split(DELIMITER)
        return Cars(names.stream().map { Car(Positive.create(0), Name.create(it)) }
            .toList())
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

    companion object {
        private const val DELIMITER = ","
        const val MOVABLE_NUMBER = 4
    }
}
