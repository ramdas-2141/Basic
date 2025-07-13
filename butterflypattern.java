public class butterflypattern {
    public static void main(String[] args){
      int n=7;

          for(int i=1;i<=n;i++){
            int stars=i;
            int spaces=2*(n-i);
            for(int j=1;j<=stars;j++){
                System.out.print(" *");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
            for(int i =n;i>=1;i--){
            int star =i;
            int space =2*(n-i);
            for(int j=1;j<=star;j++){
                System.out.print(" *");
            }
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
          

        }
    }

    

        
    
    
    

