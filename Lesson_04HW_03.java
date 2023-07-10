import java.util.LinkedList;
import java.util.ListIterator;

/*
1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
2. Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */
public class Lesson_04HW_03 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(1);
        linfedListNew(list);
    }

    private static void linfedListNew(LinkedList<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();
        int count=0;
        while (listIterator.hasNext()){
            count=count+listIterator.next();
        }
        System.out.println(count);
    }
}
