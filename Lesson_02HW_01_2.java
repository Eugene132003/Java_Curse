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

        StringBuilder builder = new StringBuilder("[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]");
        ArrayList<String> surname = new ArrayList(); //фамилии
        logger.log(Level.INFO, "Создан массив для фамилий");
        ArrayList<Integer> assessment = new ArrayList(); //оценка
        logger.log(Level.INFO, "Создан массив для оценок");
        ArrayList<String> subject = new ArrayList(); //предмет
        logger.log(Level.INFO, "Создан массив для предметов");

        surnameArray (surname,builder.toString());
        logger.log(Level.INFO, "Заполнен массив для фамилий");
        assessmentArray (assessment,builder.toString());
        logger.log(Level.INFO, "Заполнен массив для оценок");
        subjectArray (subject,builder.toString());
        logger.log(Level.INFO, "Заполнен массив для предметов");
        outPrint(surname, assessment, subject);
        logger.log(Level.INFO, "Записан файл с оценками пофамильно");

    }
    public static ArrayList surnameArray (ArrayList surname, String stokeJson){
        Pattern patternAll = Pattern.compile("\"фамилия\":\".+?\",\"оценка\"");
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
        Pattern patternAll = Pattern.compile("\"оценка\":\".+?\",\"предмет\"");
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
        Pattern patternAll = Pattern.compile("\"предмет\":\"(.+?)\"}");
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
                StringBuilder result = new StringBuilder("Студент "+surname.get(i)+" получил "+assessment.get(i).toString()+" по предмету "+subject.get(i)+".");
                writer.write(result.toString());
                writer.write("\n");
                System.out.println(result.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
