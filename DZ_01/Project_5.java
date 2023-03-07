// *+Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет

public class Project_5 {
    public static void main(String[] args) {
        System.out.println("Введите выражение: ");
        String[] str = System.console().readLine().split(" ");
        char[] charQ = str[0].toCharArray();
        char[] charW = str[2].toCharArray();
        char[] charE = str[4].toCharArray();
        int temp = 0;
        for (int i = 0; i < charE.length; i++) {
            if (charQ[i] == '?') {
                if (charW[i] == '?') {
                    if (charE[i] == '?') {
                        charQ[i] = charW[i] = charE[i] = '0';
                    }
                    else{
                        charQ[i] = '0';
                        charW[i] = charE[i];
                    }
                }
                else{
                    if (charE[i] == '?'){
                        charE[i] = charW[i];
                        charQ[i] = '0';
                    }
                    else{
                        temp = (Character.getNumericValue(charE[i]) - Character.getNumericValue(charW[i]));
                        if (temp < 0){
                            temp += 10;
                            charQ[i - 1] -= 1;
                        }
                        charQ[i] = (char)('0' + temp);
                    }
                }
            }
            else {
                if (charW[i] == '?'){
                    if (charE[i] == '?'){
                        charW[i] = '0';
                        charE[i] = charQ[i];
                    }
                    else {
                        temp = (Character.getNumericValue(charE[i]) - Character.getNumericValue(charQ[i]));
                        if (temp < 0){
                            temp += 10;
                            charW[i - 1] -= 1;
                        }
                        charW[i] = (char)('0' + temp);
                    }
                }
                else {
                    temp = (Character.getNumericValue(charQ[i]) + Character.getNumericValue(charW[i]));
                    if (temp > 9) {
                        temp -= 10;
                        charE[i - 1] += 1;
                    }
                    charE[i] = (char)('0' + temp);
                }
            }
        }
        System.out.println(String.valueOf(charQ) + " + " + String.valueOf(charW) + " = " + String.valueOf(charE));
    }
}