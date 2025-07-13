  for(int i=1;i<=n;i++){
            int stars=2*i-1;
            int space=n-i;

            for(int j=1;j<=space;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println("");


        }