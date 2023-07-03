import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/*
1. ����� ��� ������������ ������ ����� �����, ������� �� ���� ������ �����
2. ����� ������������� ������ ArrayList.
����� �����������, ������������ � ������� �������������� �� ����� ������. Collections.max()
3. ��������� ������ ���������� ������ ��������� ������� � ������������ ������� � ������������.
������� �������� ������ ������� � ���������� ��� ���������� � ������ 4.* ����������� �������� ���������� ��������
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
        //��������, ������, �����, ����, ������, ������, ����, ������
        ArrayList<String> arrayPlanet=new ArrayList<>();
        arrayPlanet.add("��������");
        arrayPlanet.add("������");
        arrayPlanet.add("�����");
        arrayPlanet.add("����");
        arrayPlanet.add("������");
        arrayPlanet.add("������");
        arrayPlanet.add("����");
        arrayPlanet.add("������");
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
