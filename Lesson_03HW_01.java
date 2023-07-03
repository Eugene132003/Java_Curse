import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/*
1. Пусть дан произвольный список целых чисел, удалить из него четные числа
2. Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
3. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке 4.* Реализовать алгоритм сортировки слиянием
 */
public class Lesson_03HW_01 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(ThreadLocalRandom.current().nextInt(0, 11));
        }
        arrayDelete(array);
    }
    public static void arrayDelete(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2==0) {
                arrayList.remove(i);
                i--;
            }
        }
        for (int i:arrayList) {
            System.out.println(i);
        }
    }
}
