import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();
        if(a > b) {
            System.out.println(">");
        }
        else if(a < b) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }
    }
}
