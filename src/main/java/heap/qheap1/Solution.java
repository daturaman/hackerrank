package heap.qheap1;

import java.util.*;

/**
 * Created by Michael on 02/04/2017.
 */
public class Solution {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Queue<Integer> heap = new PriorityQueue<>(in.nextInt());

        while (in.hasNextInt()) {
            switch (in.nextInt()) {
                case 1:
                    heap.add(in.nextInt());
                    break;
                case 2:
                    heap.remove(in.nextInt());
                    break;
                case 3: {
                    System.out.println(heap.peek());
                }
                break;
            }
        }
    }
}
