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

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(marks[i]<min)
                min = marks[i];
            if(marks[i]>max) 
                max = marks[i];
        }

        System.out.println("Maximum Marks: "+max);
        System.out.println("Minimum Marks: "+min);

        boolean isAscending = true;
        for(int i = 0;i<size-1;i++){
            if(marks[i]>marks[i+1]) 
                isAscending = false;
        }

        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
 


        String[] names = new String[size];
        System.out.println("Enter name: ");
        for(int i=0;i<size;i++){
            names[i] = sc.nextLine();
        }

        System.out.println("Names: ");
        for(int i=0;i<size;i++){
            System.out.println(names[i]);
        }        
    }
}