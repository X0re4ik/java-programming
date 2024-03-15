package lr2;

import java.util.Arrays;
import java.util.ArrayList;

public class Example1
{
	public static void main(String[] args) {
		
		
		int[] matrix = new int[15];
		
		for (int i = 0; i < matrix.length; ++i) {
		    matrix[i] = getRandomDiceNumber(100);
		}
		
		int[] matrixCopy = new int [matrix.length];
		System.arraycopy(matrix, 0, matrixCopy, 0, matrix.length );
		Arrays.sort(matrixCopy);
        int min = matrixCopy[0];
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; ++i) {
		    if (matrix[i] == min) result.add(i);
		}
		
		System.out.println(Arrays.toString(matrix));
		System.out.println(result);
		System.out.println(min);
	}
	
	public static int getRandomDiceNumber(int limit) {
        return (int) (Math.random() * limit);
    }
}