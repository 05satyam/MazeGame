package DriverClass;

import DisplayMaze.DisplayTheMaze;
import MazeConcreteObjects.Door;
import MazeConcreteObjects.Maze;
import MazeConcreteObjects.Room;
import MazeTypeInterface.MazeTypeFactoryInterface;
import MazeTypeInterfaceImpl.EnchantedMazeFactory;
import MazeTypeInterfaceImpl.MagicMazeFactory;

import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     *
     * @param arg
     * @throws InterruptedException
     *
     * it is the driver main method which is the entry point of the maze game
     */
    public static void main(String[] arg) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String choiceToContinue = "N";
        do {
            System.out.flush();
            System.out.println("---------WELCOME TO THE MAZE----------");
            System.out.println();
            System.out.println("---We have two types of maze. Kindly select the maze type by entering choice (1 or 2)---");
            System.out.println("1. Enchanted Maze" + "   " + "2. Magic Maze");
            int mazeTypeChoice = sc.nextInt();
            System.out.println();
            System.out.println("---Please enter number of rooms required in a MAZE---");
            int numberOfRooms = sc.nextInt();
            System.out.println();

            MazeTypeFactoryInterface mazeGameFactoryObj = null; // maze factory object
            MazeGame mazeGame = new MazeGame();                 // client class which comes under main class.
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
                    DisplayTheMaze.printMaze(maze, numberOfRooms);
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
                    DisplayTheMaze.printMaze(maze, numberOfRooms);
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
        System.out.println("Door Types available for the Maze are");
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


}
