import java.util.*;

class Main {
  
  public static int getDup(String[] r) 
  {

	
		int count = 0;
		ArrayList list = new ArrayList();

		for (int h = 0; h < r.length; h++) {
			for (int f = 0; f < r.length; f++) {
				if (r[h].equals(r[f])) {
					count++;
				}
				
			}if(count>1) {
					list.add(r[h]);
				}
				count=0;
				
		}
		return list.size();
}
}