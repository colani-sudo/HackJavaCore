/*import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d%n", s1,x);
            }
            System.out.println("================================");
            
            

    }
}*/

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while(T>0){
            int n = scanner.nextInt();
            int V[n];
            int visitorIncrease;
            for(int i=0; i<n; i++){
                
                V[i] = scanner.nextInt();
                
                if(V[i+1]==n && i==0){
                    System.out.println("Case #" + (i+1) + ": " + n);
                    break;
                }else if(V[i+1]==n && i==n-1) 
                    System.out.println("Case #" + (i+1) + ": " + V[i]);
                int visitorIncrease = (isLarger(V[i-1],V[i])) ? V[i] : 0;
            }
            if(visitorIncrease > 0){
                System.out.println("Case #" + (i+1) + ": " + visitorIncrease);
            }
            T--;
        }
    }
    public boolean isLarger(int prev, int next){
        return (next > prev) ? true : false;
    }
}
