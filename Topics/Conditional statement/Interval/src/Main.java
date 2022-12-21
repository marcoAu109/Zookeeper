import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tester = scanner.nextInt();
        boolean output =  (tester>-15 && tester<=12) || (tester>14 && tester<17) || (tester >=19);
        if(output){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}