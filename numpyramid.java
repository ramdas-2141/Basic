public class numpyramid{

    public static void main(String[] args){
        int n=5;
        int count=1;

        for(int i=1;i<=n;i++){
            int space= n-1;
        
            for(int j=1;j<=space;j++){
                System.out.println(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(count +" ");
            count++;
        }
       System.out.println("");  
    }
    
}
}