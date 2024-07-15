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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1+ " factorial is: "+calculateFactorial(num1));
    }
}