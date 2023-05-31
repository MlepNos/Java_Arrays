import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] UnsortedArray = RandomArrayCreator(10);

        PrintArray(UnsortedArray);
        //or
        System.out.println(Arrays.toString(UnsortedArray));

        System.out.println(Arrays.toString(SortIntegers(UnsortedArray,"A")));
        System.out.println(Arrays.toString(SortIntegers(UnsortedArray,"D")));
    }


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

    /* Array Challange 1
Create a program using arrays, that sorts a list of integers, in descending order.
Descending order means from highest value to lowest.
In other words, if the array has the values 50, 25, 80, 5, and 15,
your program should return an array, with the values in the descending order: 80, 50, 25, 15,  and 5.
First, create an array of randomly generated integers.
Print the array before you sort it.
And print the array after you sort it.
You can choose to create a new sorted array, or just sort the current array
     */









}