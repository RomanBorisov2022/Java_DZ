import java.util.Scanner;

// n! (произведение чисел от 1 до n)

public class Project_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int userInput = in.nextInt();
        int result = 1;
        for (int i = 1; i <= userInput; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
