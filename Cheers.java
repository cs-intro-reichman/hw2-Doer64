// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0].toUpperCase();
                int i = 0;
                String letters = "AEFHILMNORSX"; //all letters to write "an" for
                while(i < args[0].length()){
                        String aOrAn = "a ";    //defalt for regular letters

                        if(letters.indexOf(word.charAt(i)) != -1) //checks if the current letter needs "an"
                                aOrAn = "an";

                        System.out.println("Give me " + aOrAn + " " + word.charAt(i) + ": " + word.charAt(i) + "!");
                        i++;
                }

                System.out.println("What does that spell?");

                for(int j = 0; j < Integer.parseInt(args[1]); j++){
                        System.out.println(word + "!!!");
                }
        }
}
