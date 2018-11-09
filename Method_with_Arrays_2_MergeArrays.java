import java.util.Arrays;
class Main {
  public static int[] mergR(int[] a,int[] b) {
    int[] mer = new int[a.length + b.length];
  int z = 0;
  for(int i = 0 ; i < a.length ; i ++){
    mer[z] = a[i];
    z++;
  }
 for ( int k = 0 ; k < b.length ; k++){
   mer[z] = b[k];
   z++;
 }
  return mer;
   
    
  }//end mergR
  
  public static void main(String[] args) 
  {
   
  }
}