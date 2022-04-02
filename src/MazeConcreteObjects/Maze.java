package MazeConcreteObjects;

import java.util.ArrayList;
import java.util.List;

public class Maze {

    List<List<Integer>> mazeMatrix;
    public Maze makeMaze(int numberOfRooms) {
        Maze mazeObj = new Maze();
        mazeObj.setMaze(new ArrayList<>());
        return mazeObj;


    }

    public void setMaze(List<List<Integer>> maze) {
        this.mazeMatrix = maze;
    }

    public List<List<Integer>> getMaze() {
        return mazeMatrix;
    }
}
