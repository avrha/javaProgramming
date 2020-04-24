import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileArray {
    public static void main(String[] args) throws FileNotFoundException {
        //Create array with a fixed size of 5
        final int SIZE = 5;
        String[] cities = new String[SIZE];

        //counter variable
        int i = 0;

        //open and access cities.txt
        File file = new File ("cities.txt");
        Scanner inputFile = new Scanner(file);
        
        //parse through file
        while(inputFile.hasNext() && i < cities.length){
            cities[i] = inputFile.next();
            i++;
        } 
        inputFile.close();

        //output array
        for(String element: cities){
            System.out.println(element);
        }
    }
}