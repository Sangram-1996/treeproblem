import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class Main {
    
	public static void MaximumDistanceBetweenTwoSameElements(int n, int[] arr) {

	   //System.out.println(Arrays.toString(arr));
	   
	   HashMap<Integer, Integer> hm = new HashMap<>();
	   
	   int max = 0;
	   for(int i = 0; i < n; i++) {
	       if(!hm.containsKey(arr[i])) hm.put(arr[i], i);
	       else max = Math.max(max, i-hm.get(arr[i]));
	   }
	   System.out.println(max);
    }

	public static void main(String[] args) throws IOException {
   	 
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
   	 
    	int tc = Integer.parseInt(bufferedReader.readLine().trim());
    	
    	for(int i = 0; i < tc; i++) {
    	    int n = Integer.parseInt(bufferedReader.readLine().trim());
    	    
    	    String[] strArr = bufferedReader.readLine().trim().split(" ");
    	    int[] intArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
    	    
    	    MaximumDistanceBetweenTwoSameElements(n, intArr);
    	}
        bufferedReader.close();
	}
}
