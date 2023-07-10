import java.util.LinkedList;
import java.util.ListIterator;

/*
1. ����� ��� LinkedList � ����������� ����������. ���������� �����, ������� ������ ������������� ������. ����������� �� ���������� � ����� �� ��������.
2. ���������� ������� � ������� LinkedList �� ���������� ��������:
enqueue() - �������� ������� � ����� �������, dequeue() - ���������� ������ ������� �� ������� � ������� ���,
first() - ���������� ������ ������� �� �������, �� ������.
3. ������� ����� ���� ��������� LinkedList, �������� ��� �������� � ������. ����������� ��������
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
