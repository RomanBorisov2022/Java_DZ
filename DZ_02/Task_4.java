// import java.lang.System.Logger;
// import java.lang.System.Logger.Level;
// import java.util.Scanner;
// import java.util.logging.FileHandler;
// import java.util.logging.XMLFormatter;
// import java.io.IOException;
// import java.util.logging.*;
// import java.nio.charset.StandardCharsets;
// import java.util.Arrays;
// import java.util.logging.Handler;
// import java.util.logging.SimpleFormatter;

// import javax.naming.spi.DirStateFactory.Result;

// // Дополнение к (Реализовать простой калькулятор)  - добавить логирование 
 
// public class Task_4 {

//     static Scanner scanner = new Scanner(System.in);

//     private static Logger logger = Logger.getLogger(Task_2_1.class.getName());
 
//     public static void main(String[] args) throws IOException {
//         int num1 = getInt();
//         int num2 = getInt();
//         char operation = getOperation();
//         int result = calc(num1,num2,operation);
//         System.out.println("Результат: "+ result);
//     }
 
//     public static int getInt(){
//         System.out.println("Введите число:");
//         int num;
//         if(scanner.hasNextInt()){
//             num = scanner.nextInt();
//         } else {
//             System.out.println("Ошибка ввода.");
//             scanner.next();
//             num = getInt();
//         }
//         return num;
//     }
 
//     public static char getOperation(){
//         System.out.println("Введите операцию:");
//         char operation;
//         if(scanner.hasNext()){
//             operation = scanner.next().charAt(0);
//         } else {
//             System.out.println("Ошибка ввода.");
//             scanner.next();
//             operation = getOperation();
//         }
//         return operation;
//     }
 
//     public static int calc(int num1, int num2, char operation) throws IOException {
//         FileHandler fh = new FileHandler("log.txt");
//         logger.addHandler(fh);
//         SimpleFormatter sFormatter = new SimpleFormatter();
//         fh.setEncoding("UTF-8");
//         fh.setFormatter(sFormatter);
//         int result = 0;
//         switch (operation){
//             case '+':
//                 result = num1+num2;
//                 String str1 = Integer.toString(result);
//                 logger.info(str1);
//                 break;
//             case '-':
//                 result = num1-num2;
//                 String str2 = Integer.toString(result);
//                 logger.info(str2);
//                 break;
//             case '*':
//                 result = num1*num2;
//                 String str3 = Integer.toString(result);
//                 logger.info(str3);
//                 break;
//             case '/':
//                 if (num2 != 0){
//                     result = num1/num2;
//                     String str4 = Integer.toString(result);
//                     logger.info(str4);
//                 } 
//                 else {
//                     System.out.println("На ноль делить нельзя!");
//                 }
//                 break;
//             default:
//                 System.out.println("Операция не распознана. Повторите ввод.");
//                 result = calc(num1, num2, getOperation());
//             }
//         return result;
//     }
// }
