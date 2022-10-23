import java.util.*;

public class Main {
    public static void allocArray(int p[], int m, int n)
    {
        p = new int[m];
        int i;
        int arr[] = new int[m * n];
        for(i=0; i<m; i++){
            p[i] = arr[i * n];
        }
    }
    public static void main(String[] args) {
        int array[]={};
        int j, k;
        allocArray(array, 5, 10);
        for(j = 0;j < 5;j ++)
            for(k = 0;k < 10;k ++)
                array[j][k] = j * 10 + k;
        for(j = 0;j < 5;j ++)
            for(k = 0;k < 10;k ++)
                System.out.printf("%x ", &array[j][k]));
    }
}