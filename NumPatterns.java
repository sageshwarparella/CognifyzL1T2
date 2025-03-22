//inverted version of pyramid number pattern 
import java.util.*;
public class NumPatterns{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of rows");
    int n=sc.nextInt();
    for(int i=n;i>=1;i--){
        for(int j=n;j>i;j--){
            System.out.print(" ");
        }
        for (int k=1; k<(i*2);k++) {
            System.out.print(k);
        }   
        System.out.println();
    }
    }
}