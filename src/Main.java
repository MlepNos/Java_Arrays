import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {





    }

    public static void Reverse(int[] array){
        int maxIndex = array.length -1;
        int half = array.length/2;
        int temp =0;
        for(int i=0;i<half;i++){
           temp=array[i];
           array[i]= array[maxIndex-i];
           array[maxIndex-i]=temp;
           System.out.println(Arrays.toString(array));
        }

    }
    public static int[] ReverseCopy(int[] array ){
        int[] ReversedArrayCopy = new int[array.length];
        int maxIndex = array.length-1;
        for(int element : array){
            ReversedArrayCopy[maxIndex--] = element;
        }
    return ReversedArrayCopy;
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
/*
    Arrays Challange 3 -> Reverse Array
The challenge is to write a method called reverse, that takes an int array as a parameter.
In the main method, call the reverse method, and print the array both before and after the reverse method is called.
To reverse the array, you have to swap the elements, so that the first element is swapped with the last element, and so on.
So for example, if the array contains the numbers 1,2,3,4,5, then the reversed array should be, 5,4,3,2,1
use readIntegers() from the last question.


Methods:
// this method will change the original array
  public static void Reverse(int[] array){
        int maxIndex = array.length -1;
        int half = array.length/2;
        int temp =0;
        for(int i=0;i<half;i++){
           temp=array[i];
           array[i]= array[maxIndex-i];
           array[maxIndex-i]=temp;
           System.out.println(Arrays.toString(array));
        }

    }
    // this method wont change the original array
    public static int[] ReverseCopy(int[] array ){
        int[] ReversedArrayCopy = new int[array.length];
        int maxIndex = array.length-1;
        for(int element : array){
            ReversedArrayCopy[maxIndex--] = element;
        }
    return ReversedArrayCopy;
    }

Main:
        int[] myArray = readIntegers();
        System.out.println(Arrays.toString(myArray));

        //Reverse(myArray);
        //System.out.println(Arrays.toString(myArray));

        int[] copyArray =ReverseCopy(myArray);
        System.out.println(Arrays.toString(copyArray));
        System.out.println(Arrays.toString(myArray));


2 Dimensional Arrays
Main:
  int[][] array2 = new int[4][4];
        //System.out.println(Arrays.toString(array2));
        //System.out.println("array2.length = " + array2.length);

        for (int[] outer : array2) {
            //System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                //System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1);
            }
           //System.out.println();
        }

        for (var outer : array2) {
            for (var element : outer) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //System.out.println(Arrays.deepToString(array2));



*/
}