import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
2. Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */
public class Lesson_04HW_01 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(linfedListNew(list));
    }
    public static LinkedList<String> linfedListNew(LinkedList<String> list){
        LinkedList<String> listNew=new LinkedList<>();
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            listNew.add(listIterator.previous());
        }
        return listNew;
    }
}
