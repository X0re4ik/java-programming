package lr2;
import java.util.Arrays;

public class Example2
{
	public static void main(String[] args) {
		
		
		int[][] matrix = new int[12][5];
		
		boolean forward = true;
		for (int i = 0; i < matrix.length; i++) {
		    if (forward) {
		        for (int j = 0; j < matrix[i].length; j++) {
		            matrix[i][j] = getRandomDiceNumber(100);
		        }
		    }
		    else {
		        for (int j = matrix[i].length - 1; j >= 0; j--) {
		            matrix[i][j] = getRandomDiceNumber(100);
		        }
		    }
		    
		    forward = !forward;
		}
		
		System.out.println(Arrays.deepToString(matrix));
	}
	
	public static int getRandomDiceNumber(int limit) {
        return (int) (Math.random() * limit);
    }
}