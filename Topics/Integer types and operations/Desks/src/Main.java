import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int aClass = a/2 + a%2;
        int bClass = b/2 + b%2;
        int cClass = c/2 + c%2;

        int allDesks = aClass + bClass + cClass;

        System.out.println(allDesks);
        }
    }
