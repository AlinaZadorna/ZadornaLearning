package homeWork7_Collections.SecondTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GradeBook {

    public static void main(String[] args) {

        Set<String> namesOfStudents = TestResults.listOfStudentsNames();

        HashMap<String, Integer> firstTest = TestResults.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResults.getMakeUpGrades();

        HashMap<String, Integer> gradeBookMap = new HashMap<>();

        for (String i : namesOfStudents) {
            if (firstTest.get(i) > secondTest.get(i)) {
                gradeBookMap.put(i, firstTest.get(i));
            } else gradeBookMap.put(i, secondTest.get(i));
        }

        System.out.println("The final results are: ");
        for (Map.Entry<String, Integer> item : gradeBookMap.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}
