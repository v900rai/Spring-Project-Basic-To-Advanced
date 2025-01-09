



import java.util.Scanner;

public class TypingTest {
    public static void accuracy(String sentence , String my_sentence){
        double chars = 0;
        double Total_chars = sentence.length();
        for(int i =0 ; i<sentence.length(); i++){
            if(sentence.charAt(i) == my_sentence.charAt(i)){
                chars++;
            }
        }
        double percentage = (chars / Total_chars) * 100;
        System.out.println("You total accuracy is " + percentage + "%");
    }

    public static void main(String[] args) {
        String sentence = "Hello this is my channel";
        System.out.println("Welcome to typing test Application ");
        System.out.println("Write following Sentence \n" + sentence + "\n");
        Scanner input = new Scanner(System.in);
        long start_time = System.currentTimeMillis();
        String my_sentence = input.nextLine();
        long end_time = System.currentTimeMillis();
        long total_time = end_time-start_time;
        double seconds = total_time/1000;
        double words = sentence.split(" ").length;
        double wpm = (words/seconds)*60;
        System.out.println("Your Total words per minute : " + wpm);
        System.out.println("You take total time : " + seconds + " Seconds");
        if(sentence.equals(my_sentence)){
            System.out.println("Wow Your accurecy is 100%");

        }

        else accuracy(sentence, my_sentence);

    }
}