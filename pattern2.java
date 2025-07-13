public class pattern2 {
    public static void main(String[] args){
        int N=6;

        for(int i=N;i>=1;i--) {
            int stars = i;
            int space = N-stars;

            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print(" *");
        }
        System.out.println("");
    } 
    
}
}
