import java.io.*;
import java.util.*;

/*
 * 
 */
public class Solution {

	// Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {

    	// **** ****
    	int count = 0;
    	
     	for (int i = 0; i < arr.length - 2; i++) {
    		
    		for (int j = i + 1; j < arr.length - 1; j++) {
    			    			
    			// **** arr[j] - arr[i] == d ****
    			if (arr[j] - arr[i] == d) {
    				
        			for (int k = j + 1; k < arr.length; k++) {
        				        				
        				// **** arr[k] - arr[j] == d ****
        				if (arr[k] - arr[j] == d) {
        					
        					// ???? ????
        					System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
        					
        					count++;
        					break;
        				}
        				
        			}
     
    			}

    		}
    		
    	}
    	
    	// **** ****
    	return count;
    }
    
    
    // **** brute force approach (too slow) ****
    static int theTriplets(int d, int[] arr) {
    	
    	int count = 0;
    	
    	for (int i = 0; i < arr.length - 2; i++) {
    		
    		for (int j = i + 1; j < arr.length - 1; j++) {
    			
    			for (int k = j + 1; k < arr.length; k++) {
    				
    				if ((arr[j] - arr[i] == d) && (arr[k] - arr[j] == d)) {
    					
    					// ???? ????
    					System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");

    					count++;
    				}
    				
    			}
    		}
    	}
    	
    	return count;
    }
    
 
    private static final Scanner scanner = new Scanner(System.in);

    // Testing scaffold.
    public static void main(String[] args) throws IOException {
    	
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    	
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        
        // ***** ****
        int result = beautifulTriplets(d, arr);
        
//        // **** ****
//        int result = theTriplets(d, arr);
        
        
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
