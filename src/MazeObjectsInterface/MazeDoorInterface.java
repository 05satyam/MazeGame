package MazeObjectsInterface;

import MazeConcreteObjects.Door;
import MazeMapeSiteBaseInterface.MapSiteBaseInterfaceClass;
import MazeObjectsInterfaceImpl.BombDoor;
import MazeObjectsInterfaceImpl.EnchantedDoor;
import MazeObjectsInterfaceImpl.GlassDoor;

import java.util.List;

public interface MazeDoorInterface extends MapSiteBaseInterfaceClass {

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

    public List<Door> createDoorLayoutForRoom(int doorsLayout, boolean isEvenRowOddRoom);
}
