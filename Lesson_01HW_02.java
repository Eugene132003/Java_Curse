//2) Вывести все простые числа от 1 до 1000
public class Lesson_01HW_02 {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (isSimple(i) == true) {
                System.out.println(i);
            }
        }
    }
    public static boolean isSimple(Integer number) {
        if(number < 2) return false;
        for(int i = 2; i < number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
