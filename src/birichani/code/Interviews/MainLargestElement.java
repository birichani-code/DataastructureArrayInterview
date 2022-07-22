
 /*
  * Author     : birichani.code
  * Date         : 22/07/22  18:30
  * Project Name : JavaArrayInterview
  * */


 package birichani.code.Interviews;

 import static birichani.code.Interviews.FindLargestThree.findLargestThree;

 public class MainLargestElement {
     public static void main(String[] args) {
         int[] arr ={19, 1, 78, 3, 45, 11, 25, 9};
         findLargestThree(arr);

     }
 }
/*At first, we check whether the current element is greater than first,if true, assign the current element to first number by
* swapping the values of first, second and third
*
* when the first condition is not true, then we compare the current element with second largest number to find whether the current number
* is second largest or not, same goes for third condition.*/