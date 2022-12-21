import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input = scanner.nextInt();
        for (int i = 1 ; i<=input ; i++) {
            if (input >= i * i) {
                System.out.println(i * i);
            }
        }

    }
}