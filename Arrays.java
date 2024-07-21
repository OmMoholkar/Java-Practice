import java.util.Scanner;

public class Arrays{
    //Syntax type[] name = new type[size];
    //Or type[] name = {1,2,3,4,5};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] marks = new int[size];

        System.out.println(("Enter elements of array: "));
        for(int i=0;i<size;i++){
            marks[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }

        String[] names = new String[size];
        System.out.println("Enter name: ");
        for(int i=0;i<size;i++){
            names[i]=sc.next();
        }

        System.out.println("Names: ");
        for(int i=0;i<size;i++){
            System.out.println(names[i]);
        }


        
    }
}