// import java.util.Scanner; // before using the scanner, you need to tell Java that you want to use it. You do this by importing it at the beginning of your Java file.


// public class ScannerExample {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter an integer: ");
//         int userNumber = scanner.nextInt();

//         scanner.nextLine();  // Consume the newline character left by nextInt()

//         System.out.print("Enter your name: ");
//         String userName = scanner.nextLine();

//         System.out.println("You entered: " + userNumber + " and " + userName);

//         scanner.close();
//     }
// }

// import java.util.Scanner;
// public class FahrenheitToCelsius {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter a Fahrenheit value ");
//         int fahrenheit = input.nextInt();
//         System.out.print("Enter a day of the week: "); 
//         String day = input.next();
//         double celsius = (5.0/9) * (fahrenheit - 32);
//         System.out.println(day + " Fahrenheit: " + fahrenheit);
//         System.out.println(day + "Celsius: " + celsius);
//     }
// }


import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        int fahrenheit = input.nextInt();
        System.out.println();
        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);
    }
}