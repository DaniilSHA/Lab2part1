public class Main {
    public static void main(String[] args) {
        GeneralPersonInfo[] persons = new GeneralPersonInfo[] {
                new Teacher("Ronald", "Turner",Gender.MAN , "Computer science", AcademicDegreeTeacher.PHD, "Programming paradigms"),
                new Teacher("Ruth", "Hollings",Gender.WOMAN, "Jurisprudence", AcademicDegreeTeacher.DOCTOR, "Domestic arbitration"),
                new Student("Leo", "Wilkinson",Gender.MAN, "Computer science", AcademicDegreeStudent.BACHELOR, (byte) 3),
                new Student("Anna", "Cunningham",Gender.WOMAN, "World economy", AcademicDegreeStudent.BACHELOR, (byte) 1),
                new Student("Jill", "Lundqvist",Gender.WOMAN, "Jurisprudence", AcademicDegreeStudent.MASTER, (byte) 1),
                new GraduateStudent("Ronald", "Correa",Gender.MAN, "Computer science", "Design of a functional programming language"),
        };
        GeneralPersonInfo.printAll(persons);
    }
}
