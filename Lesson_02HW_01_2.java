import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.logging.Logger;

public class Lesson_02HW_01_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Lesson_02HW_01_2.class.getName());
        ConsoleHandler consoleHandler=new ConsoleHandler();
        logger.addHandler(consoleHandler);
        SimpleFormatter sFormat=new SimpleFormatter();
        consoleHandler.setFormatter(sFormat);

        StringBuilder builder = new StringBuilder("[{\"�������\":\"������\",\"������\":\"5\",\"�������\":\"����������\"}, {\"�������\":\"�������\",\"������\":\"4\",\"�������\":\"�����������\"}, {\"�������\":\"�������\",\"������\":\"5\",\"�������\":\"������\"}]");
        ArrayList<String> surname = new ArrayList(); //�������
        logger.log(Level.INFO, "������ ������ ��� �������");
        ArrayList<Integer> assessment = new ArrayList(); //������
        logger.log(Level.INFO, "������ ������ ��� ������");
        ArrayList<String> subject = new ArrayList(); //�������
        logger.log(Level.INFO, "������ ������ ��� ���������");

        surnameArray (surname,builder.toString());
        logger.log(Level.INFO, "�������� ������ ��� �������");
        assessmentArray (assessment,builder.toString());
        logger.log(Level.INFO, "�������� ������ ��� ������");
        subjectArray (subject,builder.toString());
        logger.log(Level.INFO, "�������� ������ ��� ���������");
        outPrint(surname, assessment, subject);
        logger.log(Level.INFO, "������� ���� � �������� ����������");

    }
    public static ArrayList surnameArray (ArrayList surname, String stokeJson){
        Pattern patternAll = Pattern.compile("\"�������\":\".+?\",\"������\"");
        Pattern patternSurname = Pattern.compile("\":\"(.+?)\",\"");
        Matcher matcher = patternAll.matcher(stokeJson);
        while (matcher.find()) {
            String tempString=stokeJson.substring(matcher.start(), matcher.end());
            Matcher matcherSurname = patternSurname.matcher(tempString);
            if (matcherSurname.find()) {
                surname.add(matcherSurname.group(1));
            }
        }
        return surname;
    }

    public static ArrayList assessmentArray (ArrayList<Integer> assessment, String stokeJson){
        Pattern patternAll = Pattern.compile("\"������\":\".+?\",\"�������\"");
        Pattern patternAssessment = Pattern.compile("\":\"(.+?)\",\"");
        Matcher matcherA = patternAll.matcher(stokeJson);
        while (matcherA.find()) {
            String tempString=stokeJson.substring(matcherA.start(), matcherA.end());
            Matcher matcherAssessment = patternAssessment.matcher(tempString);
            if (matcherAssessment.find()) {
                assessment.add(Integer.parseInt(matcherAssessment.group(1)));
            }
        }
        return assessment;
    }

    public static ArrayList subjectArray (ArrayList subject, String stokeJson){
        Pattern patternAll = Pattern.compile("\"�������\":\"(.+?)\"}");
        Pattern patternSubject = Pattern.compile("\":\"(.+?)\"}");
        Matcher matcherS = patternAll.matcher(stokeJson);
        while (matcherS.find()) {
            String tempString=stokeJson.substring(matcherS.start(), matcherS.end());
            Matcher matcherSubject = patternSubject.matcher(tempString);
            if (matcherSubject.find()) {
                subject.add(matcherSubject.group(1));
            }
        }
        return subject;
    }

    public static void outPrint(ArrayList surname, ArrayList<Integer> assessment, ArrayList subject){
        try (FileWriter writer=new FileWriter("src/Lesson_02HW_01_2.txt")){
            for (int i = 0; i < surname.size(); i++) {
                StringBuilder result = new StringBuilder("������� "+surname.get(i)+" ������� "+assessment.get(i).toString()+" �� �������� "+subject.get(i)+".");
                writer.write(result.toString());
                writer.write("\n");
                System.out.println(result.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
