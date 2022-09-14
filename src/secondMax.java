import java.util.Arrays;

public class secondMax {
    // Function to print second largest element
     static void secondMaxNum(int arr[], int arr_size) {
        int i;

        //less than two numbers case
         if(arr_size < 2) {
             System.out.printf("Invalid, there is less than two numbers");
             return;
         }

         //basic java function that sorts array
         Arrays.sort(arr);

         //Loop will start at second largest num
         for (i = arr_size - 2; i >= 0; i-- ) {
             //display if num not equal to largest
             if (arr[i] != arr[arr_size - 1]) {
                 System.out.printf("The second largest " +
                         "element is %d\n", arr[i]);
                 return;
             }
         }
        //Fail case
         System.out.printf("There is no second largest number in array");
    }

    //driver code
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        secondMaxNum(arr, n);
    }
}
