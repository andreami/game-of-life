


object Game {

  case class Player(status: Boolean, position: Position)

  case class Grid(width: Int, height: Int)

  case class Position(x: Int, y: Int)

  case class World(grid: Grid, players: List[Player]) {
    def getPlayer(position: Position): Player =
      players.find(
        player => player.position.equals(position)
      ).getOrElse(Player(status = false, position))

  }

  def playWithTwoPlayer(grid: Grid, player1: Player, player2: Player): World = {
    World(grid, List(player1, player2) )
  }

  def go(neighbor: Int, player: Player): Player = {
    //    if(neighbor < 2 || neighbor > 3)
    //      Player(false)
    //    else Player(true)
    Player(false, Position(0,0))
  }

  def calculateAliveNeighbors(world: Grid, player: Player): Int = {
    0
  }


}


//  case class Position(x: Int, y: Int)

//  val world: Grid = Grid(10,10)
//  val player: Turtle = Turtle(true, Position())




