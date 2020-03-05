/*
 * Author: Joey Ferenchak
 * Date: February 3, 2020
 * Description: Simple arithmetic calculations.
 */

import java.lang. *;
public class lab1
{
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String args[])
    {
        //part one variables
        int kateShares = 600;
        double kateStock = 21.77;
        double commissionRate = 0.02;

        //part one equations
        double paidStock = kateShares * kateStock;
        double commissionTotal= paidStock * commissionRate;
        double kateTotal = paidStock + commissionTotal;

        //part one output
        System.out.println("Kate paid $" + paidStock + "0 for the stock alone");
        System.out.println("The amount of the commission is $" + commissionTotal);
        System.out.println("The total amount Kate paid is: $" + kateTotal );

        //part two variables
        int joeShares = 1000;
        double joeStock = 32.87;
        double soldStock = 33.92;

        //part two equations
        double joePaidStock = joeShares * joeStock;
        double  joeCommissionTotal = joePaidStock * commissionRate;
        double joeStockTotal = soldStock * joeShares;
        double joeCommissionSold = joeStockTotal * commissionRate;
        double total = joeStockTotal - joePaidStock - joeCommissionTotal - joeCommissionSold;

        //part two output
        System.out.println("Joe paid $" + joePaidStock + "0 for the stock");
        System.out.println("Joe paid his broker $" + joeCommissionTotal + " in commission fees");
        System.out.println("Joe sold the stock for $" + joeStockTotal);
        System.out.println("Joe paid his broker another $" + joeCommissionSold + " in comission fees");
        //Used math class to round final answer
        System.out.println("Joe's total profit is $ " + Math.round(total));

    }
}
