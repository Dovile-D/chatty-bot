import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numb = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < numb; i++) {
            int givenNumber = scanner.nextInt();
            if (givenNumber % 6 == 0) {
                sum = sum + givenNumber;
            }

        }
        System.out.println(sum);

    }
}