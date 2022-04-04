package DisplayMaze;

import MazeConcreteObjects.Door;
import MazeConcreteObjects.Maze;
import MazeConcreteObjects.Room;

import java.util.List;

public class DisplayTheMaze {
    /**
     * @param maze
     * @param numberOfRooms This method is used to print the final layout of the maze as per user inputs
     *                      Here we are printing the Room and corresponding doors in the room
     *                      Example:
     *                      Room : 1
     *                      Room has doors : NORTH SOUTH EAST WEST
     *                      <p>
     *                      Room : 2
     *                      Room has doors : NORTH SOUTH EAST WEST
     */
    public static void printMaze(Maze maze, int numberOfRooms) {
        System.out.println();
        System.out.println("................YOUR DESIGNED MAZE WILL LOOK LIKE .............");
        System.out.println();
        List<Room> room = maze.getRooms();
        //TimeUnit.SECONDS.sleep(30);
        int roomNumber = 1;
        for (Room r : maze.getRooms()) {
            if (r != null && r.get_door() != null && r.get_door().size() > 0) {
                System.out.println("Room : " + roomNumber);
                System.out.print("     Room has doors :  ");
                List<Door> d = r.get_door();
                for (int k = 0; k < d.size(); k++) {
                    System.out.print(d.get(k).getDirection() + "    ");
                }
                System.out.println();
            }
            roomNumber++;
        }
        System.out.println("");
        System.out.println("-----------WILL BRING YOUR MAZE TO HTML DESIGN SOON--------------");
        System.out.println();
        System.out.println("THANK YOU FOR USING OUR LAYOUT");

    }
}
