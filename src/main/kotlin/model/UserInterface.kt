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

        fun printlnWinner(winners: Winners) {
            println("우승자는: $winners")
        }
    }
}