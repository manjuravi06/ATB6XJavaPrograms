package assignment_11_may_2024_mini_project;

public class Student {

    String name;
    int age;
    double height;
    String eyeColour;

    Payment studentPayment;
    Course studentCourse;


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

    public void displayStudentInfo() {

        System.out.println("The name of the student is " + this.name + "\n" +
                "The age of the student is " + this.age + "\n" +
                "The height of the student is " + this.height + "\n" +
                "The eye colour of the student is " + this.eyeColour + "\n" +
                "The name of the course is " + this.studentCourse.courseName + "\n" +
                "The course ID is " + this.studentCourse.courseID + "\n" +
                "The stream of the course is " + this.studentCourse.stream + "\n" +
                "The amount paid is " + this.studentPayment.amount + "\n" +
                "The mode of payment is " + this.studentPayment.modeOfPayment + "\n" +
                "The payment is done by " + this.studentPayment.paidBy + "\n" +
                "------------------------------------------------------------------------");


    }


}
