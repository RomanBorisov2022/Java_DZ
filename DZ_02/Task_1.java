// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} 

import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) {
        Map<String, String> par1 = new HashMap<String,String>();
        par1.put("name","Ivanov");
        par1.put("country","Russia");
        par1.put("city","Moscow");
        par1.put("age",null);
        System.out.println(getQuery(par1));
    }
    public static String getQuery(Map<String, String> par)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : par.entrySet())
        {
            if (pair.getValue() != null)
            {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }

}