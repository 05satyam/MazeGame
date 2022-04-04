package MazeObjectsInterfaceImpl;

import MazeConcreteObjects.Door;
import MazeConcreteObjects.Room;
import MazeObjectsInterface.MazeDoorInterface;

import java.util.ArrayList;
import java.util.List;

public class EnchantedDoor extends Door implements MazeDoorInterface {

    private static EnchantedDoor singletonInstance = null;
    private EnchantedDoor(){ }

    public static EnchantedDoor getEnchantedDoorFactorySingletonInstance() {
        if (singletonInstance == null) {
            EnchantedDoor.singletonInstance = new EnchantedDoor();
        }
        return EnchantedDoor.singletonInstance;
    }

    /**+
     *
     * @param doorsLayout     : what is the layout of doors : layout 1 or layoyt 2
     * @param isEvenRowOddRoom : this parameter is for deciding between even row odd room or odd row even room
     * @return
     *
     * this method is creating a list of doors for a room and returning the list.
     */
    @Override
    public void createDoorLayoutForRoom(int doorsLayout, boolean isEvenRowOddRoom, List<Room> _rLst, int numberOfRooms, int currentRoomNumber) {
        System.out.println("isEvenRowOddRooms in bomb door " + isEvenRowOddRoom + "  room list size " + _rLst.size() + "  current room number " + currentRoomNumber);
        System.out.println();
        System.out.println("gettinf current room " + _rLst.get(currentRoomNumber));
        List<Door> doorsALreadyPresentInRoom = _rLst.get(currentRoomNumber).get_door();
        if (_rLst.get(currentRoomNumber) == null)
            _rLst.set(currentRoomNumber, new Room());
        System.out.println();
        if (doorsLayout == 1) {
            setLayout1Doors(currentRoomNumber, _rLst);

        } else if (doorsLayout == 2) {
            setLayout2Doors(doorsALreadyPresentInRoom, currentRoomNumber, numberOfRooms , _rLst, isEvenRowOddRoom);
        }
    }


    //setting layout 1 door

    public void setLayout1Doors(int currentRoomNumber, List<Room> _rLst) {
        List<Door> doorsALreadyPresentInRoom = null;
        if (_rLst.get(currentRoomNumber) == null)
            _rLst.set(currentRoomNumber, new Room());
        System.out.println();
        Door _d1 = new Door();
        Door _d2 = new Door();
        Door _d3 = new Door();
        Door _d4 = new Door();
        _d1.setDirection("NORTH");
        _d2.setDirection("SOUTH");
        _d3.setDirection("EAST");
        _d4.setDirection("WEST");
        doorsALreadyPresentInRoom = _rLst.get(currentRoomNumber).get_door();
        doorsALreadyPresentInRoom.add(_d1);
        doorsALreadyPresentInRoom.add(_d2);
        doorsALreadyPresentInRoom.add(_d3);
        doorsALreadyPresentInRoom.add(_d4);
        _rLst.get(currentRoomNumber).set_door(doorsALreadyPresentInRoom);
    }

    //setting layout 2 rooms
    public void setLayout2Doors( List<Door> doorsALreadyPresentInRoom, int currentRoomNumber, int numberOfRooms, List<Room> _rLst, boolean isEvenRowOddRoom){
        Door _d1 = new Door();
        Door _d2 = new Door();
        Door _d3 = new Door();
        Door _d4 = new Door();
        if (isEvenRowOddRoom) {
            _d1.setDirection("NORTH");
            _d2.setDirection("SOUTH");

            if (!doorsALreadyPresentInRoom.contains("NORTH"))
                doorsALreadyPresentInRoom.add(_d1);
            if (!doorsALreadyPresentInRoom.contains("SOUTH"))
                doorsALreadyPresentInRoom.add(_d2);
            _rLst.get(currentRoomNumber).set_door(doorsALreadyPresentInRoom);

            //logic for creating shared door in another room.
            if ((currentRoomNumber + numberOfRooms < (numberOfRooms * numberOfRooms))) {
                if ((_rLst.get(currentRoomNumber + numberOfRooms) == null))
                    _rLst.set(currentRoomNumber + numberOfRooms, new Room());

                // System.out.println("size of room list now  " + _rLst.size());
                List<Door> doorsSharingRoom = _rLst.get(currentRoomNumber + numberOfRooms).get_door();
                if (!doorsSharingRoom.contains("SOUTH")) {
                    _d3.setDirection("South");
                    doorsSharingRoom.add(_d3);
                }
                if (!doorsSharingRoom.contains("NORTH")) {
                    _d4.setDirection("NORTH");
                    doorsSharingRoom.add(_d4);
                }

                _rLst.get(currentRoomNumber + numberOfRooms).set_door(doorsSharingRoom);
            }
        } else {
            _d1.setDirection("EAST");
            _d2.setDirection("WEST");

            if (!doorsALreadyPresentInRoom.contains("EAST"))
                doorsALreadyPresentInRoom.add(_d1);
            if (!doorsALreadyPresentInRoom.contains("WEST"))
                doorsALreadyPresentInRoom.add(_d2);
            _rLst.get(currentRoomNumber).set_door(doorsALreadyPresentInRoom);

            //logic for creating shared door in another room.
            if (((currentRoomNumber % numberOfRooms == 0))) {
                if ((_rLst.get(currentRoomNumber + 1) == null))
                    _rLst.set(currentRoomNumber + 1, new Room());

                List<Door> doorsSharingRoom = _rLst.get(currentRoomNumber + 1).get_door();
                if (!doorsSharingRoom.contains("EAST")) {
                    _d3.setDirection("EAST");
                    doorsSharingRoom.add(_d3);
                    _rLst.get(currentRoomNumber + 1).set_door(doorsSharingRoom);
                }
            }
        }
    }
}
