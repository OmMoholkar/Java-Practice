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

    }
}