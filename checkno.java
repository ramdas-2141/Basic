import java.util.*;

public class checkno {
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     int N= sc.nextInt();

    //     for(int i=1;i>=N;i++){
    //         if(i%3==0 && i%5==0){
    //             System.out.print("FizzBuzz");
    //         }else{
    //               if(i%3==0){
    //               System.out.print("pizz");
    //                 }else{
    //                         if(i%5==0){
    //                                    System.out.print("Buzz");
    //                             }else{
    //                                 System.out.print(i);
    //                                   }
    //                        }
    //               }

    //         }
    
    //     }
    // }


public static void main(String[] args){   
     Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int counter3=0 , counter5=0;
    
    for(int i=1;i<N;i++){
        counter3++;counter5++;

        if(counter3!=3 && counter5!=5){
            System.out.println(i+" ");
        }else if(counter3==3){
            System.out.println("Fizz");
            counter3=0;
        }
        if(counter5==5){
         System.out.println("Buzz");
         counter5=0;   
        }
        }
    }
}