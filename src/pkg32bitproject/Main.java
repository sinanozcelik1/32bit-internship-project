public class Main {

  /**
   *
   * @author github.com/sinanozcelik1
   * web site -> sinanozcelik.com
   */
  public static void main(String... args) {
    Maze board = new Maze();
    board.showBoard();
    if (board.solve()) {
      System.out.println("Maze solved!\n");
      System.out.println("Movements : " + board.movements + "\n");
      board.showBoard();
    } else {
      System.out.println("No solution.");
    }
  }
}
