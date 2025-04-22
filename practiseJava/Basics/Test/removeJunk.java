public class removeJunk {
    //remove special character for the string

    public static void main(String[] args) {

        String s = "jkbasdjkfkjdsa हिंदी भाषा में कुल 3456fkjfn saf234";

        //[^a-zA-Z0-9]

        //replace all is a replacing function
        
        s= s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);




        // remove the regular expression

        

    }
}
