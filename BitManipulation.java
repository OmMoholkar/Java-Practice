import java.util.Scanner;

public class BitManipulation{
    public static void main(String[] args) {
        //get bit on 2nd position
        int n = 5;
        int i = 2;
        int bitMask = 1<<i;
        if((bitMask & n)==0){          //when condition is set to check for == 1, the ans varies.
            System.out.println("0");
        } 
        else{
            System.out.println("1");
        }

        //set bit on second position as 1
        int j = 1;
        int bitMask2 = 1<<j;
        int set = bitMask2 | n;
        System.out.println(set);

        //clear bit at pos i
        int notBitmask = ~(bitMask);
        int clear = notBitmask & n;
        System.out.println(clear);

        //update bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 -> set; oper=0 -> clear
        n = 5;
        int pos = 1;
     
        bitMask = 1<<pos;
        if(oper == 1) {
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } 
        else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
