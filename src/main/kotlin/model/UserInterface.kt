package model

class UserInterface {
    companion object {
        fun printlnCarName() {
            println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분). ")
        }

        fun printlnTryCount() {
            println("게임 실행 횟수를 입력하세요: ")
        }

        fun input(): String = readLine()!!

        fun printlnWinner(game: Game) {
            game.cars.cars.stream().forEach {
                printlnMove(it)
            }
            println()
            println("우승자는")
            game.winners.cars.stream().forEach { println(it.name.name) }
        }

        private fun printlnMove(car: Car) {
            print(car.name.name + ": ")
            repeat(car.position.number()) {
                print("-")
            }
            println()
        }
    }
}