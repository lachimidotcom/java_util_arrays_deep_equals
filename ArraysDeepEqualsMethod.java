import java.util.Arrays;

public class ArraysDeepEqualsMethod{
public static void main(String[] args){

//int[] A = new int[] {1,2,3};
//int[] B = new int[] {1,2,3};
//int[] C = new int[] {3,2,1};

int[][] A2D = { { 1, 2 }, { 3, 4 } };
int[][] B2D = { { 1, 2 }, { 3, 4 } };
int[][] C2D = { { 2, 1 }, { 3, 4 } };

// compares the contents of the arrays
//System.out.println("A, B are equal: " + Arrays.deepEquals(A, B));
//System.out.println("A, C are equal: " + Arrays.deepEquals(A, C));

// Array equals method only works for 1D array
System.out.println("A2D, B2D are equal: " + Arrays.deepEquals(A2D, B2D));
System.out.println("A2D, C2D are equal: " + Arrays.deepEquals(A2D, C2D));

}
}