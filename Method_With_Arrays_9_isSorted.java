import java.util.*;

class Main {
  public static boolean isSort(int[] nums) 
  {
    
    for(int i = 0; i < nums.length - 1; i++){
      if(nums[i] > nums[i + 1]){
        return false;
      }
     
     
    }
    return true;
  
  }
}