package MazeObjectsInterfaceImpl;

import MazeConcreteObjects.Door;
import MazeDoorLayoutEnums.MazeDoorLayoutsEnum;
import MazeObjectsInterface.MazeDoorInterface;

import java.util.ArrayList;
import java.util.List;

public class BombDoor extends  Door implements MazeDoorInterface{


    @Override
    public List<Door> createDoorLayoutForRoom(int doorsLayout,  boolean isEvenRowOddRoom) {
       List<Door> _dList = new ArrayList<>();
        Door _d1 = new Door();
        Door _d2 = new Door();
        Door _d3 = new Door();
        Door _d4 = new Door();
        if(doorsLayout==1){
            _d1.setDirection("NORTH");
            _d2.setDirection("SOUTH");
            _d3.setDirection("EAST");
            _d4.setDirection("WEST");
            _dList.add(_d1);
            _dList.add(_d2);
            _dList.add(_d3);
            _dList.add(_d4);
        }else if(doorsLayout==2){
            if(isEvenRowOddRoom){
                _d1.setDirection("NORTH");
                _d2.setDirection("SOUTH");
            }else{
                _d1.setDirection("EAST");
                _d2.setDirection("WEST");
            }
            _dList.add(_d1);
            _dList.add(_d2);
        }
        System.out.println("doors added + "+ _d1.getDirection() + "   "+ _d2.getDirection() +"  "+ _d3.getDirection() + "   "+ _d4.getDirection());
        return _dList;
    }
}
