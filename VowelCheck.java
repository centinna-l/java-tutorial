import java.util.*;

public class VowelCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        int i = 1, char_count = 0;
        while (i <= 5) {
            System.out.println("Please Enter a Character");
            // Taking a String and converting it to lowercase
            ch = sc.nextLine().toLowerCase();
            if (ch.charAt(0) == 'a' || ch.charAt(0) == 'e' || ch.charAt(0) == 'i' || ch.charAt(0) == 'o' || ch
                    .charAt(0) == 'u') {
                char_count += 1;
            }
            i++;
        }
        System.out.println("The total count of Vowels is: " + char_count);
        sc.close();
    }
}
