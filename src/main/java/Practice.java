import java.util.*;


public class Practice {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int destCount = in.nextInt();
        Map<String, Integer> destinations = new HashMap<>(destCount);

        for(int i = 0; i < destCount; i++){
            String dest = in.next();
            if(!destinations.containsKey(dest)){
                destinations.put(dest, 1);
            }else{
                Integer count = destinations.get(dest);
                destinations.put(dest, ++count);
            }
        }
        int max = 0;
        String maxDest = "";
        for(Map.Entry<String, Integer> e: destinations.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                maxDest = e.getKey();
            }
        }
        System.out.println(maxDest);
    }
//        for (int row = 0; row < 5; row++) {
//            for (int col = 0; col < 5; col++) {
//                System.out.print(row + ":" + col + " ");
//            }
//            System.out.println();
//        }
}

