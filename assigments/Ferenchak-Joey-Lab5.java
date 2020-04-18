import java.io.Console;
import java.util.Scanner;

public class SavingAccount {
  //variables
  double annualInterest = 0;
  double totalInterest = 0;
  double balance = 0;
  double sumDeposit = 0;
  double sumWithdraw = 0;

  //methods
  void output(){
    System.out.printf("Ending balance: $%2.0f\n", balance);
    System.out.printf("Total amount of deposits: $%2.0f\n", sumDeposit);
    System.out.printf("Total amount of withdrawals: $%2.0f\n", sumWithdraw);
    System.out.printf("Total interest earned: $%2.0f\n", totalInterest);
  }

  void withdraw(double num){
    balance -= num;
    sumWithdraw += num;
  }

  void deposit(double num){
    balance += num;
    sumDeposit += num;
  }

  double calcInterest(){
    return annualInterest/ 12;
  }

  void addInterest(double num){
    double temp = num * balance;
    balance += temp;
    totalInterest += temp;
  }

  //constructor
  public SavingAccount(Double num1, Double num2) {
    annualInterest = num1;
    balance = num2;
    
  }

  //main program
  public static void main(String []args){
    Scanner numInput = new Scanner(System.in);
    System.out.print("Enter the annual interest rate & balance: ");
    SavingAccount obj1 = new SavingAccount(numInput.nextDouble(), numInput.nextDouble());

    System.out.print("Enter the number of months that have passed since the account was established: ");
    int numMonths = numInput.nextInt();

    //calculate monthly interest
    double monthlyInterest = obj1.calcInterest();

    for(int i = 1; i <= numMonths; i++){
      System.out.print("Amount deposited into account during month " + i + " : ");
      obj1.deposit(numInput.nextDouble());
      System.out.print("Amount withdrawn from account during month " + i + " : ");
      obj1.withdraw(numInput.nextDouble());
      obj1.addInterest(monthlyInterest);
    }
    obj1.output();
  }
}
