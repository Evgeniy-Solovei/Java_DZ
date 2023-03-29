package DZ.Seminar2;

// Дано четное число N (>0) и символы c1 и c2.
//     Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//     Пример. (n = 6, c1='a', c2='b') -> "ababab"
//     (n = 8, c1='x', c2='y') -> "xyxyxyxy"
// public class DZ_2 {
//     static String buildString(int n, char c1, char c2) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < n; i++) {
//             sb.append(i % 2 == 0 ? c1 : c2);
//         }
//         return sb.toString();
//     }
// }

// Создать файл file.txt. Если файл уже создан, ничего делать не надо. Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
import java.io.*;
 
public class DZ_2 {
 
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("notes3.txt", true))
        {
            for (int i = 0; i < 100; i++) {
                String text = "TEXT";
            writer.write(text);
            }
            
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}