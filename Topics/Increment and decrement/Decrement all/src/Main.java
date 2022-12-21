import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var first = scanner.nextInt();
        var second = scanner.nextInt();
        var third = scanner.nextInt();
        var fourth = scanner.nextInt();
        System.out.println(--first + " " + --second + " " + --third+" " + --fourth);

    }
}
