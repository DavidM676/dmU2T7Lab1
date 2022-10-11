import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str1 = scan.nextLine();
        int l = str1.length();
        String fh = str1.substring(0, l/2);
        String sh = str1.substring(l/2);
        System.out.println("String len: "+l);
        System.out.println("First half: "+fh);
        System.out.println("Second half: "+sh);

        System.out.println("Enter another String: ");
        String str2 = scan.nextLine();

        if (l > str2.length())  {
            System.out.println(str1+ "is longer");
        } else if (l==str2.length()){
            System.out.println("Both strings have the same length");
        } else {
            System.out.println(str2+" is longer");
        }

        int x = (str1.compareTo(str2));
        if (x==0) {
            System.out.println("Both strings have the same characters");

        } else if (x > 0) {
            System.out.println(str1+" is longer")
        }


    }
}
