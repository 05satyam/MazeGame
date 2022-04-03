package DriverClass;

import MazeConcreteObjects.Door;
import MazeConcreteObjects.Maze;
import MazeConcreteObjects.Room;
import MazeTypeInterface.MazeTypeFactoryInterface;
import MazeTypeInterfaceImpl.EnchantedMazeFactory;
import MazeTypeInterfaceImpl.MagicMazeFactory;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] arg) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String choiceToContinue = "N";
        do {
            System.out.flush();
            System.out.println("---------WELCOME TO THE MAZE----------");
            System.out.println();
            System.out.println("---Please enter number of rooms required in a MAZE---");
            int numberOfRooms = sc.nextInt();
            System.out.println();

            System.out.println("---We have two types of maze. Kindly select the maze type by entering choice (1 or 2)---");
            System.out.println("1. Enchanted Maze" + "   " + "2. Magic Maze");
            int mazeTypeChoice = sc.nextInt();
            MazeTypeFactoryInterface mazeGameFactoryObj = null;
            MazeGame mazeGame = new MazeGame();
            Maze maze = null;
            int doorType=0;
            int layOutChoice =0;
            switch (mazeTypeChoice) {
                case 1:
                    mazeGameFactoryObj = new EnchantedMazeFactory();
                    doorType  = getDoorTypeFromUser();
                    if(doorType==-1){
                        System.out.println("Entered door choice is not correct. ERROR");
                        break;
                    }

                    //get layout choice input from user
                    layOutChoice = getLayoutChoiceFromUser();
                    maze = mazeGame.createMaze(numberOfRooms, mazeGameFactoryObj, doorType, layOutChoice);
                    System.out.println("maze "+ maze );
                    System.out.println("numnber of rooms in maze "+ maze.getRooms().size());
                    System.out.println("number of doors in rooms 1 "+ maze.getRooms().get(0).get_door().size());
                    //TimeUnit.SECONDS.sleep(30);
                    printMaze(maze, numberOfRooms);
                    break;
                case 2:
                    mazeGameFactoryObj = new MagicMazeFactory();
                    doorType  = getDoorTypeFromUser();
                    if(doorType==-1){
                        System.out.println("Entered door choice is not correct. ERROR");
                        break;
                    }
                    //get layout choice input from user
                    layOutChoice = getLayoutChoiceFromUser();
                    maze = mazeGame.createMaze(numberOfRooms, mazeGameFactoryObj, doorType, layOutChoice);

                    break;
                default:
                    System.out.println("You entered a wrong choice. Kindly try again");
            }
            System.out.println();
            System.out.println("Do you want to continue again (Y/N)???");
            choiceToContinue = sc.next();
        } while ("Y".equalsIgnoreCase(choiceToContinue));

        System.out.println();
        System.out.println("         EXITING THE GAME. GOOD BYE!!!        ");
    }


    public static int getDoorTypeFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Door Types avalable for the Maze are");
        System.out.println("1. Bomb Door   " + "   2. Enchanted Door  " + "3. Glass Door");
        String doorChoiceYN = "n";
        int doorChoice = 0;
        do {
            System.out.println("Enter the choice from 1 to 3");
            doorChoice = sc.nextInt();
            System.out.println("doorChoice "+ doorChoice);
            if (doorChoice > 3 || doorChoice < 1) {
                System.out.println("Invalid Selection!! Do You want to make another choice (Y/N)?");
                doorChoiceYN = sc.next();
            }
        } while ("Y".equalsIgnoreCase(doorChoiceYN));

        return (3 < doorChoice || doorChoice < 1)? -1 : doorChoice;
    }

    public static int getLayoutChoiceFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice for maze layout (1/2)");
       return sc.nextInt();
    }

    public static void printMaze(Maze maze, int numberOfRooms) throws InterruptedException {
        System.out.println("There are total of "+ (numberOfRooms*numberOfRooms) + " in the maze where maze size is "+ (numberOfRooms*numberOfRooms));
        //printMaze(maze, numberOfRooms);
        List<Room> room = maze.getRooms();
        //System.out.println("rooms sizes "+ maze.getRooms().size()  + "   number of rooms "+ numberOfRooms);
        //TimeUnit.SECONDS.sleep(30);
        int m=1;
        for(int i=0;i<room.size();){
            for(int j=0;j<numberOfRooms;j++){
                System.out.println("romm number "+ m);
                m++;
                Room r = room.get(i);
                System.out.println("room has door s: ");
                List<Door> d = r.get_door();
                for(int k=0;k<d.size();k++){
                    System.out.print(d.get(k).getDirection() + "    ");
                }
                i=i+numberOfRooms;
                System.out.println();
            }
        }

    }
}
