import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson_01HW_03 {
    public static void main(String[] args)throws IOException {
        System.out.print("Введите первое число: ");
        BufferedReader reader1=new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader1.readLine());
        System.out.print("Введите второе число: ");
        BufferedReader reader2=new BufferedReader(new InputStreamReader(System.in));
        int number2 = Integer.parseInt(reader2.readLine());
        System.out.print("Введите знак операции (умножение *, деление /, сложение +, вычитание -): ");
        BufferedReader reader3=new BufferedReader(new InputStreamReader(System.in));
        String znak = reader3.readLine();
        deystvie(number1,number2,znak);
    }
    public static void deystvie(int a, int b, String c){
        switch (c){
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            default:
                System.out.println("Неизвестное действие");
                break;
        }
    }
}
