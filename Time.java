import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       int time;
       Scanner kbd;
        kbd = new Scanner(System.in);
        
        // Prompt user to enter time in 24-hour format (HH:MM)
        System.out.print("Enter time in 24-hour format (HH:MM): ");
        time = kbd.nextInt();
        
        
        
        
        // Check if the hour is 1 (1 AM)
        if (time == 1) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good afternoon");
        }
        
        // Close the scanner to avoid resource leak
        
    }
}
