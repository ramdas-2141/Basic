public class hourglasspattern {
     public static void main(String[] args){
        int n=5;

        
  
        for(int i=n;i>=1;i--){
            int stars=2*i;
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
          for(int i=1;i<=n;i++){
            int stars=2*i;
            int space=n-i;

            for(int j=1;j<=space;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println("");


        }
    }
    
    }
    

