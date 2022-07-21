
 /*
  * Author     : birichani.code
  * Date         : 21/07/22  23:40
  * Project Name : JavaArrayInterview
  * */


 package birichani.code.Interviews;

 import static birichani.code.Interviews.RearrangeArrayElements.rearrange;

 public class Main {
     public static void main(String[] args) {
         int[] arr ={-9,5,1,-2,-15,7,12,-3,2};
         rearrange(arr);

         for (int j : arr) {
             System.out.println(j + "");
         }
     }
 }
 /*the idea is to iterate through the array and when a negative number is found , then bring that number to the beginning
  * of the array by swapping it with the first positive number.
  * The output is not maintaining the original sequence of array elements.*/