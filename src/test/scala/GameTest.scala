import Game.{Grid, Player, Position, World}
import org.scalatest.funsuite.AnyFunSuite

class GameTest extends AnyFunSuite {

  test("player dead or alive with initial status alive"){
    val neighborsNo = 0
    val player = Player(true, Position(0,0))

    val actual = Game.go(neighborsNo, player)
    val expected = Player(false, Position(0,0))
    assert(actual == expected)

  }

  test("calculate neighbors"){
    val player = Player(true, Position(0,0))
    val world = Grid(3, 3)

    val actual: Int = Game.calculateAliveNeighbors(world, player)
    val expected: Int = 0

    assert(actual == expected)

  }

  test("play game"){
    val world = Grid(3, 3)
    val positionPlayer1 = Position(2,2)
    val positionPlayer2 = Position(2,3)
    val player1 = Player(status = true, positionPlayer1)
    val player2 = Player(status = true, positionPlayer2)

    val result: World = Game.playWithTwoPlayer(world, player1, player2)

    val actualPlayer1 = result.getPlayer(positionPlayer1)

    assert(actualPlayer1 == Player(status = true, positionPlayer1))
  }
}
