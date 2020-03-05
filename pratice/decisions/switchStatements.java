public class switchStatements {
  public static void main(String[] args){
    int x = 3;

    switch(x){
      case 1:
        System.out.println("x is one"); 
        break;

      case 2:
        System.out.println("x is two");
        break;

      case 3:
        System.out.println("x is three");
        break;

      default:
        System.out.println("x is not found by switch cases");
    }
  }
}
