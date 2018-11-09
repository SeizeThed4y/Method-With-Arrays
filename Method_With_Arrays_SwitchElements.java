import java.util.Arrays;
class Main {
public static int[] do_switch(int[] i) 
 {
for (int j = 0; j < i.length; j++) {
			int temp = i[0];
			i[0] = i[i.length-j-1];
			i[i.length-j-1] = temp;
		}
		return i;

	}
	}
