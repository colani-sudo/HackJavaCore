import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;
import static java.util.stream.Collectors.toList;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        System.out.println(maximumHourglassSum(arr));
        bufferedReader.close();
    }
    public static int maximumHourglassSum(List<List<Integer>> arr){
        int sum = Integer.MIN_VALUE;
        if((arr.size()* arr.size()) >=9){
            for(int i=0; i < (arr.size()-2); i++){ //loops for each cell
                for(int j=0; j < (arr.get(i).size()-2); j++) {       // j for row, i for col
                    int sums = arr.get(j).get(i) + arr.get(j).get(i+1) + arr.get(j).get(i+2) +
                                                arr.get(j+1).get(i+1) +
                            arr.get(j+2).get(i) + arr.get(j+2).get(i+1) + arr.get(j+2).get(i+2);
                    if(sums > sum){
                        sum = sums;
                    }
                }
            }

            return sum;
        }
        return 0;
    }
}