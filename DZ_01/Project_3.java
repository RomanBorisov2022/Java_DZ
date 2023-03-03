import java.util.Scanner;

// Вывести все простые числа от 1 до 1000

public class Project_3 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Введите число: ");
        int userInput = n.nextInt();
        int result = 0;
        for (int i = 1; i <= userInput; i++) {
            result += 1;
            System.out.println(result);
        }
    }
}