package MazeObjectsInterfaceImpl;

import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;

import java.util.ArrayList;
import java.util.List;

public class EnchantedMazeRoom extends Room implements MazeRoomInterface {

    /**+
     *
     * @param numberOfRooms    :  number of rooms in the maze
     * @param doorsLayout      :  what layput is required by user:  Layout1 or Layout 2. as per documentations
     * @param mazeDoorInterfaceObj : door interface object which consist of runtime child object.
     * @return
     *
     * this method will create number of rooms in the maze.
     * Also this method is assigning doors to the each room depending on the layoyt choosen by the client.
     */

    @Override
    public List<Room> createNumberOfRoomsInMaze(int numberOfRooms, int doorsLayout, MazeDoorInterface mazeDoorInterfaceObj) {
        List<Room> _rLst = new ArrayList<>((numberOfRooms*numberOfRooms));
        System.out.println("inside make room of enchanted maze");
        boolean isEvenRowOddRooms=false;
        for (int i = 0; i < numberOfRooms ; i++) {
            for(int j=0;j<numberOfRooms;j++) {
                Room _r = new EnchantedMazeRoom();
                //skip if (row is even and room is even) || (row is odd and room is odd)
                if(i%2==0 && j%2==0)
                    continue;

                //else contiue for all other configuration
                if((i%2==0) && (j%2!=0))
                    isEvenRowOddRooms=true;
                else isEvenRowOddRooms=false;
                //System.out.println("isEvenRowOddRooms "+ isEvenRowOddRooms);
                _r.set_door(mazeDoorInterfaceObj.createDoorLayoutForRoom(doorsLayout, isEvenRowOddRooms, _rLst, numberOfRooms));
                _rLst.add(_r);
            }
        }
        return _rLst;
    }

}
