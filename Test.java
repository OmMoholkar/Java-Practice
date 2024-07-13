import java.util.*;

class Test{
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Inputs
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        System.out.println("Hello " + name);
        if(age >= 18){
            System.out.println(name + " is above 18");
        }
        else{
            System.out.println(name +" is below 18.");
        }

    }
}