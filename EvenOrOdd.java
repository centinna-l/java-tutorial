import java.util.*;

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, even_count = 0, odd_count = 0;
        while (i <= 5) {
            System.out.println("Please enter the no");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                even_count += 1;
            } else {
                odd_count += 1;
            }
            i++;
        }
        System.out.println("The count of even numbers is: " + even_count);
        System.out.println("The count of odd numbers is: " + odd_count);
        sc.close();
    }
}