import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String a = scanner.nextLine();
        String aChanged = a.replace("a","b");
        System.out.println(aChanged);
    }
}