import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
/**
 * Project_7 Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл. Вариант 2
 */
public class Task_2 {
 
    public static void main(String[] args) throws IOException {

        int [] arr = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            try (FileWriter fw = new FileWriter("file.txt", Charset.forName("UTF-8"), true)) {
                for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i] > arr[i+1]){
                        isSorted = false;   
                        temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp; 
                        fw.write(Arrays.toString(arr));
                        fw.append('\n');
                        fw.flush();                 
                    }                    
                }             
            } catch (Exception e) {
                System.out.println("error");
            } finally {
                System.out.println("Этап сортировки завершен.");
            }          
        }
        System.out.println(Arrays.toString(arr));
    }
}