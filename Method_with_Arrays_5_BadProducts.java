class Main {
  public static boolean badP(int[] products,int limit)
  {
    
    int counter = 0;
    for(int i = 0; i < products.length; i++){
      if(products[i] == 0){
        counter++;
        }
        
      }
      
      if(counter >= limit){
        return false;
      }
      return true;
    }
  }
  
  
  //2nd way 
  
  // int count = 0;

		// for (int i = 0; i < products.length; i++) {

		// 	if (products[i] == 0) {
		// 		count++;
		// 	}
		// }
		// if (count < limit) {
		// 	return true;
		// } 
		// 	return false;
