public class StringBuilderTest{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Om");
        System.out.println(sb);

        //return char at index
        char index0 = sb.charAt(0);
        System.out.println(index0);

        //append char at end
        sb.append(" ");
        System.out.println(sb);

        //set char at index
        sb.setCharAt(2, '@');
        System.out.println(sb);

        //insert char at index
        sb.insert(2, ' ');
        System.out.println(sb);

        //delete at index    
        sb.delete(3,sb.length());
        System.out.println(sb);

        //String reversal 
        StringBuilder rev = new StringBuilder("");
        for(int i=sb.length()-1;i>=0;i--){
            rev = rev.append(sb.charAt(i));
        }
        System.out.println(rev);

        //string reversal 2
        for(int i=0;i<=sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);

    }
}