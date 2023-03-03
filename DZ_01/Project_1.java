import java.util.Scanner;

// вычислить n-ое треугольного число(сумма от 1 до n), !n (произведение от 1 до n)

public class Project_1 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Введите число: ");
        int userInput = n.nextInt();
        int result = 0;
        for (int i = 1; i <= userInput; i++) {
            result += i;
    }
        System.out.println(result);
    }
}