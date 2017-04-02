package arrays.left.rotation;

import java.util.Scanner;

/**
 * Created by Michael on 01/04/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int [] rotated = new int[arr.length];
        System.arraycopy(arr, d, rotated, 0, arr.length-d);
        System.arraycopy(arr, 0, rotated, arr.length-d, d);

        for(int i : rotated){
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static void shiftEachElement(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        while(d-- > 0){
            //shift every element to the left by one
            for(int j = 0; j < arr.length; j++){

                arr[j-1] = arr[j];
            }
        }

        for(int i : arr){
            System.out.print(i);
            System.out.print(" ");
        }
    }

    //This is much faster
    public static void withArrayCopy(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int [] rotated = new int[arr.length];
        System.arraycopy(arr, d, rotated, 0, arr.length-d);
        System.arraycopy(arr, 0, rotated, arr.length-d, d);

        for(int i : rotated){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
