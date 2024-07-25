import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Unsorted Array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Ascending Order array
        for(int i=0;i<size-1;i++){
            int smallest = i;
            for(int j=i+1;j<size;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }
        

        System.out.println("Ascending Order: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Descending Order array
        for(int i=0;i<size-1;i++){
            int smallest = i;
            for(int j=i+1;j<size;j++){
                if(arr[j]>arr[smallest]){
                    smallest = j;
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println("Descending Order: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}