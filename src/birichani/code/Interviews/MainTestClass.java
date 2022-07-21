
 /*
  * Author     : birichani.code
  * Date         : 22/07/22  00:01
  * Project Name : JavaArrayInterview
  * */


 package birichani.code.Interviews;

 import static birichani.code.Interviews.RearrangeArrayElements.rearrange;

 public class MainTestClass {
     public static void main(String[] args) {
         int[] arr ={-9,5,1,-2,-15,7,12,-3,2};
         rearrange(arr);

         for (int j : arr) {
             System.out.println(j + "");
         }
     }

 }


 /*The output is maintaining the original sequence of the array elements*/