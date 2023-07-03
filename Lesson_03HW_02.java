import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

/*
1. Пусть дан произвольный список целых чисел, удалить из него четные числа
2. Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
3. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке 4.* Реализовать алгоритм сортировки слиянием
 */
public class Lesson_03HW_02 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(ThreadLocalRandom.current().nextInt(0, 11));
        }
        System.out.println("Максимальное число в коллекции: "+ Collections.max(array));
        System.out.println("Минимальное число в коллекции: "+ Collections.min(array));
        System.out.println("Среднее арифметическое число в коллекции: "+ average(array));
    }
    static double average (ArrayList<Integer> list) {
        double sum = 0;
        for(int i=0;i<list.size();i++) {
            sum+=list.get(i);
        }
        return sum/list.size();
    }
}
