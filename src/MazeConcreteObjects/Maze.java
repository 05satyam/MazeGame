package MazeConcreteObjects;

import java.util.ArrayList;
import java.util.List;

public class Maze {

    List<List<Integer>> mazeMatrix;
    List<Room> rooms;

    public Maze makeMaze(int numberOfRooms) {
        Maze mazeObj = new Maze();
        mazeObj.setMaze(new ArrayList<>());
        mazeObj.setRooms(createNumberOfRoomsInMaze(numberOfRooms));
        return mazeObj;
    }

    public List<Room> createNumberOfRoomsInMaze(int numberOfRooms){
        List<Room> _rLst = new ArrayList<>();
        for(int i=0;i<numberOfRooms*numberOfRooms; i++){
            Room _r = new Room();
            _rLst.add(_r);
        }
     return _rLst;
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
}
