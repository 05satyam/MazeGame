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
            MazeTypeFactoryInterface mazeGameFactoryObj =null;
            MazeGame mazeGame = new MazeGame();
            Maze maze =null;
            switch (mazeTypeChoice) {
                case 1:
                    mazeGameFactoryObj = new EnchantedMazeFactory();
                    maze = mazeGame.createMaze(numberOfRooms, mazeGameFactoryObj);
                    break;
                case 2:
                    mazeGameFactoryObj = new MagicMazeFactory();
                    maze = mazeGame.createMaze(numberOfRooms, mazeGameFactoryObj);
                    break;
                default:
                    System.out.println("You entered a wrong choice. Kindly try again");
            }
            System.out.println();
            System.out.println("Do you want to continue (Y/N)???");
            choiceToContinue = sc.next();
        }while("Y".equalsIgnoreCase(choiceToContinue));

        System.out.println();
        System.out.println("         EXITING THE GAME. GOOD BYE!!!        ");
    }
}
