import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание обзекта для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Просим ввести пользователя максимальное число (ограничение для поиска)
        System.out.print("Введите ограничение: ");
        int maxNum = Integer.parseInt(scanner.nextLine());

        int countAttempt = countAttempt(maxNum);
        System.out.println("Колличество попыток: " + countAttempt + " - " + (countAttempt + 1));

        bunarySearch(maxNum, scanner);

    }

    static int countAttempt(int maxNum){ // Вычесление колличества попыток
        int maxNumsCopy = maxNum;
        int countAttempt = 0;
        while (maxNumsCopy >= 2){
            maxNumsCopy  /= 2;
            countAttempt++;
        }
        return  countAttempt;
    }

    static void bunarySearch(int maxNum, Scanner scanner){
        int maxNumCopy = maxNum;
        int minNum = 0;
        // Бинарный поиск числа:
       int meanNum;
       while (maxNumCopy - minNum != 1 && maxNumCopy - minNum!= 0){
           meanNum = (maxNumCopy + minNum)/2;
           System.out.print("Ваше число больше чем " + meanNum + " (1 - true, 0 - false) ");
           int isTrue = Integer.parseInt(scanner.nextLine());
           if (isTrue == 1){
               minNum = meanNum;
           } else {
               maxNumCopy = meanNum;
           }
           System.out.println(maxNumCopy);
           System.out.println(minNum);
           System.out.println(maxNumCopy - minNum);
       }
       System.out.println("Ваше число " + maxNumCopy);
    }
}