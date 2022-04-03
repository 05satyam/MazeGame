package MazeObjectsInterface;

import MazeConcreteObjects.Door;
import MazeConcreteObjects.Room;
import MazeMapeSiteBaseInterface.MapSiteBaseInterfaceClass;
import MazeObjectsInterfaceImpl.BombDoor;
import MazeObjectsInterfaceImpl.EnchantedDoor;
import MazeObjectsInterfaceImpl.GlassDoor;

import java.util.List;

public interface MazeDoorInterface extends MapSiteBaseInterfaceClass {

    /**+
     *
     * @param doorTypeName   : tells the door type name selected by the user
     * @return
     *
     * this method will return the object of the door to door interface  based on door type selected by user
     */
    static MazeDoorInterface getDoorInterfaceFromDoorChoice(String doorTypeName){
        switch (doorTypeName){
            case "BombDoor" : return new BombDoor();
            case "EnchantedDoor" : return new EnchantedDoor();
            case "GlassDoor"  : return new GlassDoor();
            default:
                break;
        }
        return null;
    }

    /**+
     *
     * @param doorsLayout      : layout of door choosen by user like layout1 or layout 2
     * @param isEvenRowOddRoom  : tells if the current room in which doors to be assigned is even roow odd room or odd row even room as per the documentation given
     *
     * @return
     */
    public List<Door> createDoorLayoutForRoom(int doorsLayout, boolean isEvenRowOddRoom, List<Room> _rLst, int numberOfRooms);
}
