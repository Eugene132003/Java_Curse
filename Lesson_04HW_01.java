import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
1. ����� ��� LinkedList � ����������� ����������. ���������� �����, ������� ������ ������������� ������. ����������� �� ���������� � ����� �� ��������.
2. ���������� ������� � ������� LinkedList �� ���������� ��������:
enqueue() - �������� ������� � ����� �������, dequeue() - ���������� ������ ������� �� ������� � ������� ���,
first() - ���������� ������ ������� �� �������, �� ������.
3. ������� ����� ���� ��������� LinkedList, �������� ��� �������� � ������. ����������� ��������
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
