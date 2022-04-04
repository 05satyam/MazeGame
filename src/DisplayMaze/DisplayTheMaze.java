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

    /**+
     * method for printing maze sample layout for user to understand to give proper input
     */
    public static void mazeLayouts(){
        System.out.println("LAYOUT 1 for 2X2 matrix");
        System.out.println("The first layout has all 4 doors in each room.");

        System.out.println("    N        N");
        System.out.println(" E     W          W");
        System.out.println("    S        S");
        System.out.println(" E     W          W");
        System.out.println("    S        S");

        System.out.println("LAYOUT 2 for 2X2 matrix" );
        System.out.println(" For each even row, each odd Room has NORTH and SOUTH doors.");
        System.out.println("For each odd row, each even Room has WEST and EAST doors");
        System.out.println("");
        System.out.println("    -        N");
        System.out.println(" -     -          -");
        System.out.println("    -        S");
        System.out.println(" E     W         -");
        System.out.println("    -        -");

    }
}
