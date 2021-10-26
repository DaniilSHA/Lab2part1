public class GraduateStudent extends GeneralPersonInfo{
    private String dissertationName;

    protected GraduateStudent (String firstName, String secondName, Gender gender, String nameFaculty, String dissertationName) {
        setFirstName(firstName);
        setSecondName(secondName);
        setGender(gender);
        setNameFaculty(nameFaculty);
        setDissertationName(dissertationName);
        setVerb();
    };

    @Override
    public void setVerb() {
        verb = "studies";
    }

    public void setDissertationName (String dissertationName){
        this.dissertationName = dissertationName;
    }

    public String getDissertationName () {
        return dissertationName;
    }

    @Override
    public String printDetails () {
        return " " + getGender().getSayTwo() + " thesis title is \"" + getDissertationName() + "\".";
    };
}
