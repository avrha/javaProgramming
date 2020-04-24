import java.util.Scanner;

public class rateCalc {
  public static void main(String[] args) {

    //Used to read integers from console
    Scanner numInput = new Scanner( System.in );

    //Variables in use 
    double rateA = 9.95;
    double rateB = 13.95;
    double rateC = 19.95;

    double addA = 2.00;
    double addB = 1.00;

    int hoursA = 10;
    int hoursB = 20;

    String a = "A";
    String b = "B";
    String c = "C";

    //Greeting the user
    System.out.println("Enter the customer's package (A,B,C):");

    // Using Console to input data from user
    String input = System.console().readLine();

    //Nested if else statements
    if (input.equals(a))
    {
      System.out.println("Enter the number of hours used:");
      int tempHours = numInput.nextInt();

      tempHours /= hoursA;
      double tempAdd = tempHours - 1;
      tempAdd *= 10;
      addA = tempAdd;

      double tempSum =  tempHours * rateA;
      tempSum += addA;
      System.out.println("The charges are $" + tempSum);

      tempHours /= hoursB;
      double tempAdd2 = tempHours - 2;
      tempAdd2 *= 20;
      addB = tempAdd2;

      double tempSumB = tempHours * rateB;
      tempSumB += addB;

      if (tempSumB < tempSum && rateC < tempSum)
      {

        tempSumB = tempSum - tempSumB;
        rateC = tempSum - rateC;
        System.out.println("With package B you would have saved $" + tempSumB);
        System.out.println("With package C you would have saved $" + rateC);

      }

      else if (rateC < tempSum)
      {
        rateC = tempSum - rateC;
        System.out.println("With package C you would have saved $" + rateC);
      }

      else if (tempSumB < tempSum)
      {
        tempSumB = tempSum - tempSumB;
        System.out.println("With package B you would have saved $" + tempSumB);
      }

      else
      {
        //Do nothing
      }
    }

    else if(input.equals(b))
    {
      System.out.println("Enter the number of hours used:");
      int tempHours = numInput.nextInt();

      tempHours /= hoursB;
      double tempAdd = tempHours - 1;
      tempAdd *= 20;
      addB = tempAdd;

      double tempSum =  tempHours * rateB;
      tempSum += addB;
      System.out.println("The charges are $" + tempSum);

      tempHours /= hoursA;
      double tempAdd2 = tempHours - 2;
      tempAdd2 *= 10;
      addB = tempAdd2;

      double tempSumA = tempHours * rateA;
      tempSumA += addA;

      if (tempSumA < tempSum && rateC < tempSum)
      {

        tempSumA = tempSum - tempSumA;
        rateC = tempSum - rateC;
        System.out.println("With package B you would have saved $" + tempSumA);
        System.out.println("With package C you would have saved $" + rateC);

      }

      else if (rateC < tempSum)
      {
        rateC = tempSum - rateC;
        System.out.println("With package C you would have saved $" + rateC);
      }

      else if (tempSumA < tempSum)
      {
        tempSumA = tempSum - tempSumA;
        System.out.println("With package A you would have saved $" + tempSumA);
      }

      else
      {
        //Do nothing
      }
    }

  else if(input.equals(c))
  {
    System.out.println("Enter the number of hours used:");
    int tempHours = numInput.nextInt();

    tempHours /= hoursA;
    double tempAdd = tempHours - 1;
    tempAdd *= 10;
    addA = tempAdd;

    double tempSum =  tempHours * rateA;
    tempSum += addA;
    System.out.println("The charges are $" + tempSum);

    tempHours /= hoursB;
    double tempAdd2 = tempHours - 2;
    tempAdd2 *= 20;
    addB = tempAdd2;

    double tempSumB = tempHours * rateB;
    tempSumB += addB;

    if (tempSumB < rateC && tempSum < rateC)
    {

      tempSumB = rateC - tempSumB;
      tempSum = rateC - tempSum;
      System.out.println("With package B you would have saved $" + tempSumB);
      System.out.println("With package A you would have saved $" + tempSum);

    }

    else if (tempSumB < rateC)
    {
      tempSumB = tempSumB - rateC;
      System.out.println("With package B you would have saved $" + tempSumB);
    }

    else if (tempSum < rateC)
    {
      tempSum = tempSum - rateC;
      System.out.println("With package C you would have saved $" + rateC);
    }

    else
    {
      //Do nothing
    }

  }

  else
  {
    System.out.println("Invalid input");
  }
  numInput.close();
}
}
