import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        String substring = str.substring(num1, num2 + 1);
        System.out.println(substring);
    }
}