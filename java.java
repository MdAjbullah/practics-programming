import java.util.Scanner;

/**
 * java
 */
public class java {

    // write a program to find the lenght of string withouth using inbuilt function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
    
        int i = 0;

        try {
            while (true) {
                char ch = str.charAt(i);
                i++;

            }

        } catch (Exception e) {
            System.out.println(i);

        }
    }
}