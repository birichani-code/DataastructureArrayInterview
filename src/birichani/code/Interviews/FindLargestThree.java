
 /*
  * Author     : birichani.code
  * Date         : 22/07/22  18:21
  * Project Name : JavaArrayInterview
  * */


 package birichani.code.Interviews;

 public class FindLargestThree {
    static void findLargestThree(int[] arr){
         if (arr.length<3){
             System.out.println("Invalid input, Array size is less than 3");
         }
         int first=Integer.MIN_VALUE;
         int second=Integer.MIN_VALUE;
         int third= Integer.MIN_VALUE;
         for (int current : arr) {
             if (current > first) {
                 third = second;
                 second = first;
                 first = current;
             } else if (current > second) {
                 third = second;
                 second = current;


             } else if (current > third) {
                 third = current;

             }
         }
         System.out.println("Three largest elements are:" + first + "," + second + "," + third);
     }
 }
