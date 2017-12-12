import java.util.Scanner;

public class HourGlassSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] arr = new int[size][size];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println(calculateHourglassSum(arr));
	}
	
	
	 public static int calculateHourglassSum(int[][] arr){
	        int sum = 0;
	        for(int i = 0; i < arr.length - 2; i++){
	            for(int j = 0; j < arr[i].length - 2; j++){
	                int temp = arr[i][j] + arr[i][j + 1] + 
	                           arr[i][j + 2] + arr[i + 1][j + 1] + 
	                           arr[i + 2][j] + arr[i + 2][j + 1] +
	                           arr[i + 2][j +2];
	                
	                System.out.println(temp + ", " + sum);
	                if (i + j == 0 ||temp > sum){
	                	System.out.println("updating sum...");
	                    sum = temp;
	                }
	            }
	        }
	        return sum;
	    }
}
