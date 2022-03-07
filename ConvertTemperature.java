import java.util.*;

public class ConvertTemperature {
    public static void main(String[] args) {
        float fahrenheit, celsius = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Farhenheit");
        fahrenheit = sc.nextFloat();
        celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("celsius " + celsius);
        sc.close();
    }
}
