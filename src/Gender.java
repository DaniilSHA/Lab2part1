public enum Gender {
    MAN ("He", "His"),
    WOMAN ("She", "Her");

    private String sayOne;
    private String sayTwo;

    private Gender (String sayOne, String sayTwo) {
        setSayOne(sayOne);
        setSayTwo(sayTwo);
    }

    public void setSayOne(String sayOne) {
        this.sayOne = sayOne;
    }

    public void setSayTwo(String sayTwo) {
        this.sayTwo = sayTwo;
    }

    public String getSayOne() {
        return sayOne;
    }

    public String getSayTwo() {
        return sayTwo;
    }
}
