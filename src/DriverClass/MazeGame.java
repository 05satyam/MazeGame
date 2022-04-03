package DriverClass;

import MazeConcreteObjects.Maze;
import MazeConcreteObjects.Room;
import MazeDoorLayoutEnums.DoorTypeToUserChoiceEnum;
import MazeObjectsInterface.MazeDoorInterface;
import MazeTypeInterface.MazeTypeFactoryInterface;

import java.util.List;

/**
 *  It is the Maze Game class which will be used by main method to create maze by
 *  passing the mazeFactory and other data required to create the maze
 *
 */
public class MazeGame {

    /**
     *
     * @param numberOfRooms   : it tells the number of rooms entered by the user.
     * @param mazefactoryObj  : this is the maze factory object
     * @param doorType        : it tells the door type selected by user like bombdoor, glass door etc.
     * @param layout          : it tells the type of layout selected by the user like Layout1 or layout 2.
     * @return
     *
     * Method to create crateMaze; it is creating maze with rooms in it and rooms are creating doors in it.
     * Finally we are returning the complete object of designed maze.
     */
    public Maze createMaze(int numberOfRooms, MazeTypeFactoryInterface mazefactoryObj, int doorType, int layout){
        Maze _maze = mazefactoryObj.makeMaze(numberOfRooms, mazefactoryObj);
        MazeDoorInterface mazeDoorInterface = getDoorConcreteClassForRoom(doorType, layout);
        List<Room> _roomLst = mazefactoryObj.makeRoom(numberOfRooms, layout, mazeDoorInterface);
        _maze.setRooms(_roomLst);
        return _maze;
    }

    /**
     * @param doorType  : it tells the type of door selected by the user.
     * @param layout    : it tells the type of layout selected by the user like Layout1 or layout 2.
     * @return
     *
     * This is a helper method to get the class obejct for different doors we have.
     * User will enter a door type requred and then this method will get the object of door type concrete class by using
     * the enum class designed for the same
     *
     *  ENUM CLASS FOR GETTING THE DOOR INTERFCE CHILD CLASS OBJECT :DoorTypeToUserChoiceEnum
     */
    MazeDoorInterface getDoorConcreteClassForRoom(int doorType, int layout){
        String doorTypeConcreteImplName = DoorTypeToUserChoiceEnum.getDoorInterfaceNameFromSeqChoice(doorType);
        return MazeDoorInterface.getDoorInterfaceFromDoorChoice(doorTypeConcreteImplName);
    }

}
