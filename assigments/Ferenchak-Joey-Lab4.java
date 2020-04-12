import java.io.*;

public class lab4{
  public static boolean isPrime(int num){
    //flag variable is used to identify if the number is a prime.
    boolean flag = false;
    //determine if number is divisible by another than itself 
    for(int i = 2; i <= num/2; ++i) {
      if (num % i == 0) {
        flag = true;
        break;
      }
    }
    if (!flag)
      return true;
    else
      return false;
  }

  public static void main(String[] args) throws IOException {
    //create new file named output.txt
    Writer file = new FileWriter("output.txt");
    file.write("Prime Numbers \n");

    for(int i = 1; i <= 100; i++) {
      if (isPrime(i) == true){
        //write prime number to output.txt
        file.write(String.valueOf(i) + "\n");
      }
    }
    file.close();
  }
}
