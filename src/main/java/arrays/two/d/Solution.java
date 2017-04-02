package arrays.two.d;

import java.util.Scanner;

/**
 * Created by Michael on 01/04/2017.
 */
public class Solution {

    private static final int DIMENSIONS = 6;

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[DIMENSIONS][DIMENSIONS];
        for(int arr_i = 0; arr_i < DIMENSIONS; arr_i++){
            for(int arr_j = 0; arr_j < DIMENSIONS; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        int max = 0;
        for(int row = 0;  row < 4; row++){//for each row
            for(int col = 0;  col < 4; col++){//for each col
                int top = arr[row][col] + arr[row][col+1] + arr[row][col+2];
                int middle = arr[row+1][col+1];
                int bottom = arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];

                int result = top + middle + bottom;
                if((row == 0 && col == 0) || result > max){
                    max = result;
                }
            }
        }
        System.out.println(max);
    }
}
