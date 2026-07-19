package L1;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("URK23CS1067");
        System.out.print("Enter a string: ");

        String str = sc.nextLine();
        str = str.replace(" ", "");

        System.out.println("Length of the string is " + str.length());

        sc.close();
    }
}