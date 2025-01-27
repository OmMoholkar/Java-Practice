public class Pattern {
    public static void main(String[] args) {
        
        //Filled Rectangle
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Hollow Rectangle
        int n = 4;
        int m = 5;
        for(int i =1; i<=n; i++){
            for(int j =1; j<=m; j++){
                if(i==1 || i == n || j ==1 || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Right Half of Pyramid
        int k = 5;
        for(int i=0; i<k; i++){
            for(int j=0;j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //inverted right half of pyramid
        for(int i=k;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("@");
            }
            System.out.println();
        }

        //left half pyramid
        for(int i=0;i<k;i++){
            for(int j=0;j<=k-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(("*"));
            }
            System.out.println();
        }

        //number pyramid
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //inverted number pyramid
        for(int i=k;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //floyds triangle
        int num=1;
        for(int i=0;i<=k;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        System.out.println();

        //0-1 triangle
        for(int i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
