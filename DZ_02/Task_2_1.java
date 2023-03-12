import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
/**
 * Project_7 Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
public class Task_2_1 {

    private static Logger logger = Logger.getLogger(Task_2_1.class.getName());
    
    public static void main(String[] args) throws IOException {

        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormatter = new SimpleFormatter();
        fh.setEncoding("UTF-8");
        fh.setFormatter(sFormatter);

        int [] arr = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            try {
                for (int i = 0; i < arr.length-1; i++) {
                    String str = Integer.toString(arr[i]);
                    logger.info(str);
                    if(arr[i] > arr[i+1]){
                        isSorted = false;
    
                        temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;                     
                    }                 
                }              
            } catch (Exception e) {
                logger.warning("error");
            } finally {
                logger.info("Этап сортировки завершен.");
            }          
        }
        System.out.println(Arrays.toString(arr));
    }
}