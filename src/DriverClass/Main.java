package DriverClass;

import MazeConcreteObjects.Maze;
import MazeTypeInterface.MazeTypeFactoryInterface;
import MazeTypeInterfaceImpl.EnchantedMazeFactory;
import MazeTypeInterfaceImpl.MagicMazeFactory;

import java.util.Scanner;

public class Main {


    public static void main(String[] arg) {
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
            switch (mazeTypeChoice) {
                case 1:
                    mazeGameFactoryObj = new EnchantedMazeFactory();
                    doorType  = getDoorTypeFromUser();
                    if(doorType==-1){
                        System.out.println("Entered door choice is not correct. ERROR");
                        break;
                    }
                    maze = mazeGame.createMaze(numberOfRooms, mazeGameFactoryObj, doorType);

                    break;
                case 2:
                    mazeGameFactoryObj = new MagicMazeFactory();
                    doorType  = getDoorTypeFromUser();
                    if(doorType==-1){
                        System.out.println("Entered door choice is not correct. ERROR");
                        break;
                    }

                    maze = mazeGame.createMaze(numberOfRooms, mazeGameFactoryObj, doorType);

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
        System.out.print("1. Bomb Door   " + "   2. Enchanted Door  " + "3. Glass Door");
        String doorChoiceYN = "n";
        int doorChoice = 0;
        do {
            System.out.println("Enter the choice from 1 to 3");
            doorChoice = sc.nextInt();
            if (doorChoice > 3 || doorChoice < 1) {
                System.out.println("Invalid Selection!! Do You want to make another choice (Y/N)?");
                doorChoiceYN = sc.next();
            }
        } while ("Y".equalsIgnoreCase(doorChoiceYN));

        return (!"Y".equalsIgnoreCase(doorChoiceYN) || (3 < doorChoice || doorChoice < 1)) ? -1 : doorChoice;
    }
}
