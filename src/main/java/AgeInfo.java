import java.util.Scanner;

public class AgeInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст:");
        int inputAge = scanner.nextInt();

        if (inputAge < 1) {
            System.out.println("Вы слишком малы");
        } else if (inputAge > 112) {
            System.out.println("Вы слишком стары");
        } else {
            String ageByWord = getAgeMeasureWord(inputAge);
            System.out.printf("Вам %d %s.", inputAge, ageByWord);
        }
    }

    private static String getAgeMeasureWord(int age) {
        int unitDigit = age % 10;
        int tenDigit = (age % 100) / 10;
        String word;

        if (tenDigit != 1 && unitDigit == 1) {
            word = "год";
        } else if ((1 < unitDigit && unitDigit <= 4) && tenDigit != 1) {
            word =  "года";
        } else {
            word = "лет";
        }

        return word;
    }
}