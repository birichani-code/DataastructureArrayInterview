
 /*
  * Author     : birichani.code
  * Date         : 21/07/22  23:26
  * Project Name : JavaArrayInterview
  * */


 package birichani.code.Interviews;

 public class RearrangeArrayElements {
  static void rearrange(int[] arr){
   int j=0,temp;
   for(int i=0;i< arr.length;i++){
    if (arr[i]<0){
      temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
     }
     j++;
    }
   }
 }
/*the idea is to iterate through the array and when a negative number is found , then bring that number to the beginning
* of the array by swapping it with the first positive number.
* The output is not maintaining the original sequence of array elements.*/


