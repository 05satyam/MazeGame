package MazeConcreteObjects;

import MazeObjectsInterface.MazeRoomInterface;

import java.util.ArrayList;
import java.util.List;

public class Maze {

    List<List<Integer>> mazeMatrix;
    List<MazeRoomInterface> rooms;

    public Maze makeMaze(int numberOfRooms) {
        Maze mazeObj = new Maze();
        mazeObj.setMaze(new ArrayList<>());
        return mazeObj;
    }


    public void setRooms(List<MazeRoomInterface> rooms) {
        this.rooms = rooms;
    }

    public List<MazeRoomInterface> getRooms() {
        return rooms;
    }

    public void setMaze(List<List<Integer>> maze) {
        this.mazeMatrix = maze;
    }

    public List<List<Integer>> getMaze() {
        return mazeMatrix;
    }
}
