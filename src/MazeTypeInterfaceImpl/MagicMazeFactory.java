package MazeTypeInterfaceImpl;

import MazeObjectsInterface.MazeDoorInterface;
import MazeObjectsInterface.MazeRoomInterface;
import MazeTypeInterface.MazeTypeFactoryInterface;

public class MagicMazeFactory implements MazeTypeFactoryInterface {
    @Override
    public MazeRoomInterface makeRoom() {
        return null;
    }

    @Override
    public MazeDoorInterface makeDoor() {
        return null;
    }
}