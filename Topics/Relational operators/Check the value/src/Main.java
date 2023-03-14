import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numb = scanner.nextInt();
        boolean answer = true;

        if (numb < 10) {
            System.out.println(answer);
        }
        else {
            System.out.println(!answer);
        }
    }
}