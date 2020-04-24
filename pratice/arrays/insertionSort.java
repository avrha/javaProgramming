public class insertionSort {
    public static void main(String[] args){
        int myArray[] = {1, 3, 2, 10, 7, 6, 9, 5, 8, 4};

        //print out the unorganized array
        for(int element : myArray)
            System.out.print(element + " ");
        System.out.println();

        //insertion sort
        for(int i = 1; i < myArray.length; i++) {
            int key = myArray[i];
            int j = i - 1;

            while(j >= 0 && myArray[j] > key){
                myArray[j + 1] = myArray[j];
                j--;
            }
            myArray[j + 1] = key;
        }

        //print out sorted array
        for(int element: myArray)
            System.out.print(element + " ");
        System.out.println();
    }
}