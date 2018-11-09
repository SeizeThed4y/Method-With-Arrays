import java.util.*;

class Main {
  
  public static int[] addElements(int[] ints1, int[] ints2) {
    int [] newArray = new int[ints1.length];
    
    
    for(int i = 0; i < newArray.length; i++){
      newArray[i] = ints1[i] + ints2[i];
    }
    return newArray;
  }
  
  
}