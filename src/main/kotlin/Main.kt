import model.Game
import model.UserInterface

fun main(args: Array<String>) {
    UserInterface.printlnCarName()
    val carNames = UserInterface.input()
    UserInterface.printlnTryCount()
    val tryCount = UserInterface.input().toInt()

    val game = Game(carNames, tryCount)
    game.play()
    UserInterface.printlnWinner(game)
}