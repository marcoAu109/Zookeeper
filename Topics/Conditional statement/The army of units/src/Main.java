import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int noOfUnits = scanner.nextInt();
        if (noOfUnits<1){
            System.out.println("no army");
        } else if (noOfUnits>=1 && noOfUnits<=19){
            System.out.println("pack");
        } else if (noOfUnits>=20 && noOfUnits<=249){
            System.out.println("throng");
        } else if (noOfUnits>=250 && noOfUnits<=999){
            System.out.println("zounds");
        } else if (noOfUnits>=1000){
            System.out.println("legion");
        }
    }
}