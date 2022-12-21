import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
//        System.out.println("Enter your first name:");
        String firstName=scanner.nextLine();
//        System.out.println("Enter your years of preference:");
        String years=scanner.nextLine();
//        System.out.println("Enter your cuisine preference: ");
        String cuisine= scanner.nextLine();
        System.out.println("The form for " + firstName+" is completed. We will contact you if we need a chef who cooks "+cuisine+" dishes and has "+years+" years of experience.");
    }
}