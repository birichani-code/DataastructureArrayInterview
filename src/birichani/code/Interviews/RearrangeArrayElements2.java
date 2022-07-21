
 /*
  * Author     : birichani.code
  * Date         : 21/07/22  23:53
  * Project Name : JavaArrayInterview
  * */


 package birichani.code.Interviews;

 public class RearrangeArrayElements2 {
  static void rearrange(int[] arr){
   int j, current;
   for (int i=0;i< arr.length;i++){
    current=arr[i];
    //if current element is positive then do nothing
    if (current>0){
     continue;
    }
    //if current element is negative, then shift positive
    // numbers of array[0.....i-1], one position to their right
    j=i-1;
    while (j>=0&& arr[j]>0){
     arr[j+1]=arr[j];
     j=j-1;
    }
    arr[j+1]=current;
   }
  }
 }
