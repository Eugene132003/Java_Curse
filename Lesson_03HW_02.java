import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

/*
1. ����� ��� ������������ ������ ����� �����, ������� �� ���� ������ �����
2. ����� ������������� ������ ArrayList.
����� �����������, ������������ � ������� �������������� �� ����� ������. Collections.max()
3. ��������� ������ ���������� ������ ��������� ������� � ������������ ������� � ������������.
������� �������� ������ ������� � ���������� ��� ���������� � ������ 4.* ����������� �������� ���������� ��������
 */
public class Lesson_03HW_02 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(ThreadLocalRandom.current().nextInt(0, 11));
        }
        System.out.println("������������ ����� � ���������: "+ Collections.max(array));
        System.out.println("����������� ����� � ���������: "+ Collections.min(array));
        System.out.println("������� �������������� ����� � ���������: "+ average(array));
    }
    static double average (ArrayList<Integer> list) {
        double sum = 0;
        for(int i=0;i<list.size();i++) {
            sum+=list.get(i);
        }
        return sum/list.size();
    }
}
