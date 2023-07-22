import java.util.*;

/*
2. ����� ��� ������ �����������: ���� ������, �������� �������, �������� ������, ���� ������,
���� �������, ���� ����, ���� �����, ����� ������, ���� ��������, ����� ��������, ������ ��������,
����� ������, ����� ������, ������ ������, ���� �����������, ���� ��������, ���� �����, ���� ����.
�������� ���������, ������� ������ � ������� ������������� ����� � ����������� ����������.
������������� �� �������� ������������. ��� ���������� ������������ TreeMap.
 */
public class Lesson_05HW_02 {
    public static void main(String[] args) {
        String mainString = "���� ������, �������� �������, �������� ������, ���� ������, ���� �������, ���� ����, ���� �����, ����� ������, ���� ��������, ����� ��������, ������ ��������, ����� ������,����� ������, ������ ������, ���� �����������, ���� ��������, ���� �����, ���� ����";

        System.out.println(sortNames(mainString));
    }
    public static Map sortNames(String mainString) {
        String stringArray[] = mainString.split(", ");
        HashMap<String, Integer> names = new HashMap<>();
        for (String item : stringArray) {
            String name = item.split(" ")[0];
            if (names.containsKey(name)) {
                names.replace(name, names.get(name) + 1);
            } else {
                names.put(name, 1);
            }
        }

        TreeMap<Integer, List<String>> namesArray = new TreeMap<>();
        for (String item : names.keySet()) {
            if (namesArray.containsKey(names.get(item))) {
                namesArray.get(names.get(item)).add(item);
            } else {
                List<String> list = new ArrayList<>();
                list.add(item);
                namesArray.put(names.get(item), list);
            }

        }
        return namesArray.descendingMap();
    }
}
