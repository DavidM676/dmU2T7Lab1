import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str1 = scan.nextLine();
        int l = str1.length();
        String fh = str1.substring(0, l/2);
        String sh = str1.substring(l/2);
        System.out.println("String length: "+l);
        System.out.println("First half: "+fh);
        System.out.println("Second half: "+sh);

        System.out.print("Enter another String: ");
        String str2 = scan.nextLine();
        int l2 = str2.length();

        if (l > l2)  {
            System.out.println(str1+ " is longer");
        } else if (l==l2){
            System.out.println("Both strings have the same length");
        } else {
            System.out.println(str2+" is longer");
        }

        int x = (str1.compareTo(str2));
        if (x==0) {
            System.out.println("Both strings have the same characters");

        } else if (x < 0) {
            System.out.println(str1+" is first alphabetically");
        } else {
            System.out.println(str2+" is first alphabetically");
        }
        if (str1.contains(str2)) {
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        } else {
            System.out.println(str2+ " is NOT found in " + str1);
        }

    }
}
