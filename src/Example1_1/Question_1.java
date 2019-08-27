package Example1_1;
import java.util.Scanner;

public class Question_1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter triangle a: ");
        int a = scanner.nextInt();
        System.out.print("Enter triangle a: ");
        int b = scanner.nextInt();
        if ((a+b)>180) {
            System.out.println("Such a triangle doesn't exist");
        } else if ((a == 90)||(b == 90)||((a+b)==90)) {
            System.out.println("Right angle triangle");
        }
        else {
            System.out.println("Such a triangle exist");
        }

    }
}
