import java.io.*;
import java.util.*;

public class AliceBobGame {
    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

            List<Integer> score = new ArrayList<>();
            score.add(0,0);
            score.add(1,0);
            for(int i=0; i < a.size() || i < b.size(); i++){
                if(a.get(i) < b.get(i))
                    score.set(0,(score.get(0) + 1));
                if(a.get(i) < b.get(i))
                    score.set(1,(score.get(1) + 1));
            }
            return score;
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = scanner.nextInt();
            a.add(aItem);
        }

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = scanner.nextInt();
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(String.valueOf(result.get(i)));
        }
        //close scanner
        scanner.close();
    }
    
}
