import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/*
1. Пусть дан произвольный список целых чисел, удалить из него четные числа
2. Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
3. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке 4.* Реализовать алгоритм сортировки слиянием
 */
public class Lesson_03HW_03 {
    public static void main(String[] args) {
        ArrayList<String> arrayPlanetRandom=new ArrayList<>();
        arrayPlanetRandom=newArrayPlanet(arrayPlanet());
        System.out.println(arrayPlanetRandom);

        int count=0;
        for (int i = 0; i < arrayPlanet().size(); i++) {
            for (int j = 0; j < arrayPlanetRandom.size() ; j++) {
                if (arrayPlanet().get(i).toString()==arrayPlanetRandom.get(j).toString()){
                    count++;
                }
            }
            System.out.println(arrayPlanet().get(i).toString()+" "+count);
            count=0;
        }
    }
    private static ArrayList arrayPlanet() {
        //Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун
        ArrayList<String> arrayPlanet=new ArrayList<>();
        arrayPlanet.add("Меркурий");
        arrayPlanet.add("Венера");
        arrayPlanet.add("Земля");
        arrayPlanet.add("Марс");
        arrayPlanet.add("Юпитер");
        arrayPlanet.add("Сатурн");
        arrayPlanet.add("Уран");
        arrayPlanet.add("Нептун");
        return arrayPlanet;
    }

    private static ArrayList newArrayPlanet(ArrayList arrayPlanet1) {
        ArrayList<Object> newArrayPlanet1=new ArrayList<>();
        for (int i = 0; i <20; i++) {
            newArrayPlanet1.add(arrayPlanet1.get(ThreadLocalRandom.current().nextInt(0, 7)));
        }
        return newArrayPlanet1;
    }
}
