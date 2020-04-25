/**
 * Author: Joey Ferenchak
 * Program Name: worldSeriesChampions 
 * Last Modified: April 25 2020
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class worldSeriesChampions {
    public static void main(String[] args) throws FileNotFoundException {
        //Open file (WorldSeriesWinner.txt) for parsing
        File file = new File("WorldSeriesWinners.txt");
        Scanner inputFileSize = new Scanner(file);

        //Used to determine size of file (WorldSeriesWinner.txt)
        int tempSize = 0;

        //Parse through file (WorldSeriesWinner.txt)
        while (inputFileSize.hasNextLine()) {
            inputFileSize.nextLine();
            tempSize++;
        }
        inputFileSize.close();

        //Create an array (teams) to store strings
        final int SIZE = tempSize;
        String[] teams = new String[SIZE];

        //Open file (WorldSeriesWinner.txt) again for parsing
        Scanner inputFileString = new Scanner(file);

        //Helps navigate through teams
        int i = 0;

        //Parse through file (WorldSeriesWinners) again and write to array (teams)
        while (inputFileString.hasNextLine() && i < teams.length) {
            teams[i] = inputFileString.nextLine();
            i++;
        }
        inputFileString.close();

        //Used to read Strings from console
        Scanner userInput = new Scanner(System.in);

        //Prompt user for input, then store input into selectTeam
        System.out.print("Enter a name of team: ");
        String selectTeam = userInput.nextLine();
        userInput.close();

        //Holds numbers of wins 
        int totalWins =  0;

        //Search array (teams) for matches
        for(String element: teams){
            if(element.equals(selectTeam)){
                totalWins++;
            }
        }
        
        //Output results to user
        System.out.println(selectTeam + " has won " + totalWins + " World Series");
    }
}