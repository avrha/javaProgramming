
public class copyArray {
    public static void  main(String[] args){
        int[] firstArray = {2, 4, 6, 8, 10, 12, 14 ,16, 18, 20};
        int[] secondArray= new int[5];

        //copy elements from firstArray to secondArray
        for(int i = 0; i < secondArray.length; i++){
            secondArray[i] = firstArray[i];
        }

        //print out second array
        for(int element: secondArray){
            System.out.println(element);
        }
    }
}