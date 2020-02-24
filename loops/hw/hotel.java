import java.io.Console;
import java.util.Scanner;

public class Hotel {
  public static void main(String[] args){
    //Used to read integers from console
    Scanner numInput = new Scanner(System.in);

    System.out.print("How many floors in the hotel? ");
    int floors = numInput.nextInt();
    double totalRooms = 0, totalFilledRooms = 0;

    //ensuring user enter value less than 1
    if (floors < 1) {
      System.out.print("Invalid input");
    }

    for(int i = 0; i < floors; i++){
      System.out.print("How many rooms on floor " +i+"? ");
      double tempRooms = numInput.nextInt();

      //ensursing user enters value greater than 10
      while (tempRooms < 10){
        System.out.println("Please enter a number no less than 10 ");
        tempRooms = numInput.nextInt();
      }

      System.out.print("How many rooms are occupied on floor " +i+ "? ");
      double tempFilledRooms = numInput.nextInt();

      //ensuring user enters value less than tempRoom
      while(tempFilledRooms > tempRooms){
        System.out.println("Please enter a number less than then number of the rooms");
        tempFilledRooms = numInput.nextInt();
      }

      //Adding number of rooms and filled rooms to the total
      totalRooms += tempRooms;
      totalFilledRooms += tempFilledRooms;

      //Calculating occupancy rate on the floor
      double tempOccupancy = tempFilledRooms/ tempRooms;
      //TODO - Format properly
      System.out.println(tempOccupancy +" is the occupancy rate on floor " +i);
    }
    //TODO - Caluculate overall occupancy rate
  }
}
