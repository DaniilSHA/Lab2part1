public class Student extends GeneralPersonInfo{
    private AcademicDegreeStudent academicDegreeStudent;
    private byte courseNumber;

    protected Student (String firstName, String secondName, Gender gender, String nameFaculty, AcademicDegreeStudent academicDegreeStudent, byte courseNumber) {
        setFirstName(firstName);
        setSecondName(secondName);
        setGender(gender);
        setNameFaculty(nameFaculty);
        setAcademicDegreeStudent(academicDegreeStudent);
        setCourseNumber(courseNumber);
        setVerb();
    };


    @Override
    public void setVerb() {verb = "studies";
    }

    public void setAcademicDegreeStudent (AcademicDegreeStudent academicDegreeStudent) {
        this.academicDegreeStudent = academicDegreeStudent;
    }

    public AcademicDegreeStudent getAcademicDegreeStudent () {
        return academicDegreeStudent;
    }

    public void setCourseNumber (byte courseNumber) {
        this.courseNumber = courseNumber;
    }

    public byte getCourseNumber () {
        return courseNumber;
    }

    @Override
    public String printDetails () {
        return " " + getGender().getSayOne() + " is " + getCourseNumber() + "'th year " + getAcademicDegreeStudent() + " student.";
    };
}
