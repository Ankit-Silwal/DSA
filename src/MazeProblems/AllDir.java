package mazeproblems;

public class AllDir {
  public static void main(String[] args) {
    boolean[][] arr = {
      {true, true, true},
      {true, true, true},
      {true, true, true},
    };
    maze("", arr, 0, 0);
  }
  static void maze(String p, boolean[][] maze, int r, int c) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
      System.out.println(p);
      return;
    }
    if (!maze[r][c]) {
      return;
    }
    maze[r][c] = false;

    if (r < maze.length - 1){
      maze(p + "D", maze, r + 1, c);
    } 
    if (c < maze[0].length - 1){
      maze(p + "R", maze, r, c + 1);
    } 
    if (r > 0){
      maze(p + "U", maze, r - 1, c);
    } 
    if (c > 0){
      maze(p + "L", maze, r, c - 1);
    } 
    maze[r][c] = true;
  }
}
