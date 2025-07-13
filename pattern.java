
import java.util.*;

public class pattern {
    public static void main(String[] args){
    // Scanner sc= new Scanner(System.in);
    // int N=sc.nextInt();

    // System.out.print("enter the row no"+ N);
    
    int N=5;
    int M=5;
    // for(int i=0;i<=N;i++){
    //     for(int j=0;j<=M;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println("");
    // }
    




    for(int i=0;i<=N;i++){
        for(int j=0;j<=M;j++){
            if(i==0||i==N||j==0||j==M){
            System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
}
