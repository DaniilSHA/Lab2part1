public abstract class GeneralPersonInfo {
    private String firstName;
    private String secondName;
    private Gender gender;
    private String nameFaculty;
    protected static String verb;

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setSecondName (String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName () {
        return secondName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public abstract void setVerb();

    public String getVerb() {
        return verb;
    }

    public void print () {
        System.out.print("This is " + getFirstName() + " " + getSecondName() + ". " + gender.getSayOne() + " " + verb + " at " + getNameFaculty() + ".");
        System.out.println(printDetails());
    }

    public abstract String printDetails();

    public static void printAll (GeneralPersonInfo persons[]) {
        for (GeneralPersonInfo person : persons) {
            person.print();
        }
    }
}
