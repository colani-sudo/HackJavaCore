import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int T;
        int botScore = 0;
        T = scanner.nextInt();
        while(T>0){
            int cas=0;
            int N = scanner.nextInt();
            ArrayList<Integer> cell = new ArrayList<Integer>(Collections.nCopies(N,0));



            System.out.println("Case #" + (cas+1) + ": " + botScore);
            T--;
        }
    }
}