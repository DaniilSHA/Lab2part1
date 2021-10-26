public class Teacher extends GeneralPersonInfo {
    private AcademicDegreeTeacher academicDegreeTeacher;
    private String nameSpeciality;

    protected Teacher (String firstName, String secondName, Gender gender, String nameFaculty, AcademicDegreeTeacher academicDegreeTeacher, String nameSpeciality) {
        setFirstName(firstName);
        setSecondName(secondName);
        setGender(gender);
        setNameFaculty(nameFaculty);
        setAcademicDegreeTeacher(academicDegreeTeacher);
        setNameSpeciality(nameSpeciality);
        setVerb();
    }

    @Override
    public void setVerb() {
        verb = "teaches";
    }

    public void setAcademicDegreeTeacher(AcademicDegreeTeacher academicDegreeTeacher) {
        this.academicDegreeTeacher = academicDegreeTeacher;
    }

    public AcademicDegreeTeacher getAcademicDegreeTeacher() {
        return academicDegreeTeacher;
    }

    public void setNameSpeciality(String nameSpeciality) {
        this.nameSpeciality = nameSpeciality;
    }

    public String getNameSpeciality() {
        return nameSpeciality;
    }

    @Override
    public String printDetails() {
        return " " + getGender().getSayOne() + " has " + getAcademicDegreeTeacher() + " degree in " + getNameSpeciality() + ".";
    }
}
