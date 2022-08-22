import java.sql.SQLOutput;

public class KlasaString {
    public static void main(String[] args) {

        String firstName = "Hubert";
        String secondName = "Kwiatkowski";
        String name = firstName + " " + secondName;

        System.out.println("TASK1");
        // a) print how much letters contains variables firsName secondName and name
        System.out.println("a)");
        System.out.println("First Name: "+firstName.length());
        System.out.println("Second Name: "+secondName.length());
        System.out.println("Name: "+name.length());

        // b) compare your first name with other names, eg.: "Tomasz" or "Mikolaj"
        System.out.println("b)");
        if(firstName.equals("Tomasz")){
            System.out.println("Your name is Tomasz");
        } else if (firstName.equals("Mikolaj")){
            System.out.println("Your name is Mikolaj");
        } else{
            System.out.println("Your name is not Tomasz nor Mikolaj");
        }
        //c) pirint second name in capital letters
        System.out.println("c) "+secondName.toUpperCase());

        //d) replace letters in second name 'a' to 'e'
        System.out.println("Second name before replacing: "+secondName);
        System.out.println("d) a -> e: "+secondName.replace('a','e'));

        /*Task 2
        For sentence "Coraz wiecej programuje." write each character on a separate line.
         */
        System.out.println("Task 2");
        String sentence = "Coraz wiecej programuje.";
        for (int i = 0; i<sentence.length();i++){
            System.out.println(sentence.charAt(i));
        }
        /* Task3
        Sentence from task 2, write backwards.
         */
        System.out.println("Task 3");
        for(int i = sentence.length()- 1; i >=0; i--) {
            System.out.print(sentence.charAt(i));
        }



    }
}
