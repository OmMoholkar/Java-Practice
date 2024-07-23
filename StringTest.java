public class StringTest{
    public static void main(String[] args) {

        //Concatination
        String string1 = "a";
        String lastName = "Moholkar";
        String string2 = "b";
        String fullName = string1+" "+lastName;
        System.out.println(fullName);

        //length
        System.out.println(fullName.length());

        //individual Character charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //comparasion s2.compareTo(s1)
        //s1 > s2 = +ve
        //s1 == s2 = 0
        //s1 < s2 = -ve
        // a --> lower value
        // b --> heigher value
        if(string1.compareTo(string2) == 0){
            System.out.println("Strings are equal");
        }
        else if(string1.compareTo(string2) > 0){
            System.err.println("String 1 is greater");
        }
        else if(string1.compareTo(string2) < 0){
            System.out.println("String 2 is greater");
        }

        //substring .substring(int start, int end)
        String sentence = "My name is Om";
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);

        //parseInt and toString
        String word = "1234";
        int number = Integer.parseInt(word);
        System.out.println(number);

        String reWord = Integer.toString(number);
        System.out.println(reWord);

        
    }
}