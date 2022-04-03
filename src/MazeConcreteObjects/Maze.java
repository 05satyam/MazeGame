package MazeConcreteObjects;

import MazeObjectsInterface.MazeRoomInterface;

import java.util.ArrayList;
import java.util.List;

/**+
 *
 * MAZE class. It is the main MAZE class with doors list in it.
 * It is kind of DAO class
 */
public class Maze {

    List<List<Integer>> mazeMatrix;
    List<Room> rooms;

    public Maze makeMaze(int numberOfRooms) {
        Maze mazeObj = new Maze();
        mazeObj.setMaze(new ArrayList<>());
        return mazeObj;
    }


    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setMaze(List<List<Integer>> maze) {
        this.mazeMatrix = maze;
    }

    public List<List<Integer>> getMaze() {
        return mazeMatrix;
    }

    @Override
    public String toString() {
        return "Maze{" +
                "mazeMatrix=" + mazeMatrix +
                ", rooms=" + rooms +
                '}';
    }
}
