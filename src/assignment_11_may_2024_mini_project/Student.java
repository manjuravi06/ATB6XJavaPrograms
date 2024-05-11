package assignment_11_may_2024_mini_project;

public class Student {

    String name;
    int age;
    double height;
    String eyeColour;

    public void writing() {
        System.out.println("Student is writing");
    }

    public void playing(String sport) {
        System.out.println("Student is playing " + sport);
    }

    public int marksScored() {
        return 50;
    }

    public String speaking(String lang) {
        return lang;
    }

}
