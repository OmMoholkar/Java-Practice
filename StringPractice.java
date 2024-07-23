import java.util.Scanner;

public class StringPractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names do you want to enter? ");
        int size = sc.nextInt();

        //Total length of array of strings
        String[] names = new String[size]; 
        System.out.println("Enter the names: ");
        for(int i=0;i<size;i++){
            names[i] = sc.next();
        }

        for(int i=0;i<size;i++){
            System.out.println(names[i]);
        }

        int totalLength = 0;
        for(int i=0;i<size;i++){
            totalLength += names[i].length();
        }
        System.out.println("The total characters is: "+totalLength);

        
    }
}