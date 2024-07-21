import java.util.*;
public class Functions {

    public static int calculateSum(int num1, int num2){
        return num1+num2;
    }

    //Factorial using loop
    public static int calculateFactorial(int number) {
        int factorial=1;
        for(int i=number;i>=1;i--){
            factorial=factorial*i;
        }
        return factorial;
    }

    //Average Function
    public static void average(int n1, int n2, int n3){
        int avg = (n1+n2+n3)/3;
        System.out.println("The average of three numbers is: "+avg);
    }

    //Odd numbers till n
    public static void oddNumbers(int n){
        for(int i=1;i<=n;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }

    //Count of positive, negative and zeros
    public static void count(){
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        System.out.println("Press 1 to continue and 0 to stop: ");
        Scanner sc1 = new Scanner(System.in);
        int input = sc1.nextInt();
        while(input==1){
            System.out.println("Enter your number: ");
            int num = sc1.nextInt();
            if(num>0)
                positive++;
            if(num<0)
                negative++;
            if(num==0)
                zeros++;
            System.out.println("Press 1 to continue and 0 to stop: ");
            input = sc1.nextInt();
        }
        System.out.println("Positive nos: "+positive);
        System.out.println("Negative nos: "+negative);
        System.out.println("Zeros: "+zeros);
    }

    public static void main(String[] args) {
        oddNumbers(10);
        count();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1+ " factorial is: "+calculateFactorial(num1));
    }
}