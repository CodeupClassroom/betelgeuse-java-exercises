package grades;

public class GradesApplication {

    public static void main(String[] args) {
        Student fer = new Student("Fer");

        fer.addGrade(100);
        fer.addGrade(80);
        fer.addGrade(80);
        fer.addGrade(80);

        System.out.println("fer.getGradeAverage() = " + fer.getGradeAverage());

    }
}
