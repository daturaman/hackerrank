package stack.maximum.element;

import java.util.*;

/**
 * Created by Michael on 02/04/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numElements = in.nextInt();
        Deque<Integer> stack = new ArrayDeque(numElements);
        SortedSet<Integer> values = new TreeSet<>();//FIXME this needs to be the same size as the stack

        for (int i = 0; i < numElements; i++) {
            switch (in.nextInt()) {
                case 1:
                    int e = in.nextInt();
                    stack.push(e);
                    values.add(e);
                    break;
                case 2:
                    Integer pop = stack.pop();
                    values.remove(pop);
                    break;
                case 3: {
                    int max = values.size() > 0 ? values.last() : 0;
                    System.out.println(max);
                }
                break;
            }
        }
    }
}
