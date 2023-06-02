// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



/*   Write a method called readIntegers, that reads a comma delimited list of numbers,
                entered by the user from the console, and then returns an array, containing those numbers that were entered.
                Next, write a method called findMin, that takes the array as an argument, and returns the minimum value found in that array.
        In the main method
        Call the method readIntegers, to get the array of integers from the user, and print these out,
                using a method found in java.util.Arrays.
                Next, call the findMin method, passing the array, returned from the call to the readIntegers method.
                Print the minimum element in the array, which should be returned from the findMin method.
                A tip here. Assume that the user will only enter numbers - so you don't need to do any validation for the console input.

*/

//System.out.println(readIntegers());


    }








    /* Array Challange 1
Create a program using arrays, that sorts a list of integers, in descending order.
Descending order means from highest value to lowest.
In other words, if the array has the values 50, 25, 80, 5, and 15,
your program should return an array, with the values in the descending order: 80, 50, 25, 15,  and 5.
First, create an array of randomly generated integers.
Print the array before you sort it.
And print the array after you sort it.
You can choose to create a new sorted array, or just sort the current array


Main Code:

    int[] UnsortedArray = RandomArrayCreator(10);

    PrintArray(UnsortedArray);
    //or//
    System.out.println(Arrays.toString(UnsortedArray));
    System.out.println(Arrays.toString(SortIntegers(UnsortedArray,"A")));
    System.out.println(Arrays.toString(SortIntegers(UnsortedArray,"D")));

Methods:

 public static int[] RandomArrayCreator(int len){

        Random random = new Random();
        int [] myArray = new int[len];
        for(int i=0 ; i<len ; i++){
            myArray[i] =random.nextInt(100);
        }
        return myArray;
    }
    public static void PrintArray(int[] array){
        for(int item : array){
           System.out.println(item + " ");
        }

    }

    public static int[] SortIntegers(int[] array,String type){
        int[] temp = new int[array.length];
        Arrays.sort(array);

        if(type.toUpperCase() == "D"){
            for(int i=0;i<array.length;i++) {
                temp[i] = array[array.length - 1 - i];
            }
        }else if(type.toUpperCase() == "A"){
            return array;
        }

        return temp;
    }

Arrays Challange 2

Write a method called readIntegers, that reads a comma delimited list of numbers,
entered by the user from the console, and then returns an array, containing those numbers that were entered.
Next, write a method called findMin, that takes the array as an argument, and returns the minimum value found in that array.
In the main method
Call the method readIntegers, to get the array of integers from the user, and print these out,
using a method found in java.util.Arrays.
Next, call the findMin method, passing the array, returned from the call to the readIntegers method.
Print the minimum element in the array, which should be returned from the findMin method.
A tip here. Assume that the user will only enter numbers - so you don't need to do any validation for the console input.


Main Code:
 int[] myArray = readIntegers();
       System.out.println(Arrays.toString(myArray));

       int minValue = findMin(myArray);
        System.out.println(minValue);


Methods:
 private static int[] readIntegers(){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a List of Integers, separated by comma.");
     String input = scanner.nextLine();
     //System.out.println(input);
     String[] split = input.split(",");
     int[] values = new int[split.length];
     //System.out.println(split[0]);

     for(int i =0; i< split.length;i++){
         values[i] = Integer.parseInt(split[i].trim());
     }
     //System.out.println(values[0]);
     return values;
 }


 private static int findMin(int[] array){

        int min = Integer.MAX_VALUE;
        for(int value : array) {
            min = (value<=min) ? value : min;
        }
        return min;

}
*/


}