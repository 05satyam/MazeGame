package MazeObjectsInterfaceImpl;

import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;

import java.util.ArrayList;
import java.util.List;

public class EnchantedMazeRoom extends Room implements MazeRoomInterface {

    @Override
    public List<Room> createNumberOfRoomsInMaze(int numberOfRooms, int doorsLayout, MazeDoorInterface mazeDoorInterfaceObj) {
        List<Room> _rLst = new ArrayList<>();
        System.out.println("inside make room of enchanted maze");
        boolean isEvenRowOddRooms=false;
        for (int i = 0; i < numberOfRooms ; i++) {
            for(int j=0;j<numberOfRooms;j++) {
                Room _r = new EnchantedMazeRoom();
                if(i%2==0 && j%2!=0)
                    isEvenRowOddRooms=true;
                else isEvenRowOddRooms=false;
                _r.set_door(mazeDoorInterfaceObj.createDoorLayoutForRoom(doorsLayout, isEvenRowOddRooms));
                _rLst.add(_r);
            }
        }
        return _rLst;
    }

}
