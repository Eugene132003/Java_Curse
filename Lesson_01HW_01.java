import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
2) Вывести все простые числа от 1 до 1000
3) Реализовать простой калькулятор
4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
 */
public class Lesson_01HW_01 {
    public static void main(String[] args) throws IOException {
        System.out.print("Задайте n-ое треугольного число: ");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int count=1;
        int result=0;
        while (count < number+1){
            result=(count/2)*(count+1);
            count++;
        }
        System.out.println("Результат " + number +" треугольного числа равен: "+ result);
    }
}
