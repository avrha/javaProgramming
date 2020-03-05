public class ifStatements {
  public static void main(String[] args){
    int x = 1, y = 2, z = 1;

    //comparing x to y
    if(x == y){
      System.out.println("x equals y");
    }

    else{
      System.out.println("x does not equal y");
    }

   //comparing x to y and z
    if(x == y){
      System.out.println("x equals y");
    }

    else if(x == z){
      System.out.println("x equals z");
    }

    else {
      System.out.println("x does not equal y or z");
    }
  }
}
