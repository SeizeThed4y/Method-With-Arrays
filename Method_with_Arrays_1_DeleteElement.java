import java.util.*;

class Main {
  public static int[] deleteR(int[] arr,int element) {
    int index =0;
    int [] nArr = new int [arr.length -1 ];
    for(int i = 0; i< arr.length; i++){
      if(arr[i] == element){
        continue;
      }
      nArr[index] = arr[i];
      index++;
    }
    return nArr;
   
  }//end deleteR
  

}