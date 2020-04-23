public class Sort {
  public static void main(String[] args){
    //array that stores doubles
    double[] myList = {1, 2, 3, 4, 5};

    int firstVar = 0;

    //counting the array backwards
    for (int i = myList.length - 1; i >= 0; i--) {
      if(i == firstVar){
        System.out.println(myList[i] + "\n");
      }
      else {
        System.out.println(myList[i]);
      }
    }

    //for each loop
    for(double element : myList) {
      System.out.println(element);
    }
  }
}
