import java.util.Scanner;

public class Array2D{
    public static void main(String[] args) {
        //type[][] name = new type[rows][columns];
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];
    
        //Input elements
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                System.out.println("Enter element for "+(i+1)+","+(j+1));
                numbers[i][j] = sc.nextInt();
            }
        }

        //Output Display
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        //Searching a number
        System.out.println("Enter a number to search: ");
        int key = sc.nextInt();
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                if(numbers[i][j]==key){
                    System.out.println("Number found at position "+(i+1)+","+(j+1));
                }
            }
        }

        //Display Elements in spiral order
        int rowStart = 0;
        int rowEnd = rows-1;
        int columnStart = 0;
        int columnEnd = columns-1;

        while(rowStart<=rowEnd && columnStart<=columnEnd){
            
            //left to right
            for(int i=columnStart;i<=columnEnd;i++){
                System.out.println(numbers[rowStart][i]);
            }
            rowStart++;

            //top to bottom
            for(int i=rowStart;i<=rowEnd;i++){
                System.out.println(numbers[i][columnEnd]);
            }
            columnEnd--;

            //right to left
            if(columnStart<=columnEnd){
                for(int i=columnEnd;i>=columnStart;i--){
                    System.out.println(numbers[rowEnd][i]);
                }
                rowEnd--;
            }

            //bottom to top
            if(rowStart<=rowEnd){
                for(int i=rowEnd;i>=rowStart;i--){
                    System.out.println(numbers[i][columnStart]);
                }
                columnStart++;
            }
        }
        
    }
}