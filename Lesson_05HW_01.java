import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Lesson_05HW_01 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<String, ArrayList<Integer>>();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Введите: \n 1 - добавить номер \n 2 - вывести все записи \n 3 - завершить");
                int number=Integer.parseInt(reader.readLine());
                if (number==1){
                    addPhone(phoneBook, reader);
                }
                if (number==2){
                    printAll(phoneBook);
                }
                if (number==3){
                    break;
                }
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addPhone(HashMap<String, ArrayList<Integer>> phoneBook, BufferedReader reader) {
        try {
            System.out.println("Введите фамилию:");
            String newName = reader.readLine();
            System.out.println("Введите номер телефона:");
            int newNumber = Integer.parseInt(reader.readLine());

            if (!phoneBook.containsKey(newName)) {
                phoneBook.put(newName, new ArrayList<>());
            }
            phoneBook.get(newName).add(newNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printAll(HashMap<String, ArrayList<Integer>> phoneBook) {
        phoneBook.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString().replaceAll("\\[", "").replaceAll("\\]", ""));
        });
    }
}
