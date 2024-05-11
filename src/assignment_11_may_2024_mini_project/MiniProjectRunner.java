package assignment_11_may_2024_mini_project;

public class MiniProjectRunner {

    public static void main(String[] args) {


        // Creating object for first student
        Student s1 = new Student();
        s1.name = "Steve";
        s1.height = 180.5;
        s1.eyeColour = "brown";
        s1.age = 25;

        Course c1 = new Course();
        c1.courseName = "Physics";
        c1.courseID = 123;
        c1.stream = "Science";

        Payment p1 = new Payment();
        p1.amount = 1000;
        p1.modeOfPayment = "Cash";
        p1.paidBy = "Self";

        s1.studentCourse = c1;
        s1.studentPayment = p1;

        s1.displayStudentInfo();


        // Creating object for second student
        Student s2 = new Student();
        s2.name = "Tony";
        s2.height = 170.0;
        s2.eyeColour = "blue";
        s2.age = 30;

        Course c2 = new Course();
        c2.courseName = "Chemistry";
        c2.courseID = 456;
        c2.stream = "Engineering";

        Payment p2 = new Payment();
        p2.amount = 2000;
        p2.modeOfPayment = "Card";
        p2.paidBy = "Father";

        s2.studentCourse = c2;
        s2.studentPayment = p2;

        s2.displayStudentInfo();


        //Creating object for third student
        Student s3 = new Student();
        s3.name = "Bruce";
        s3.height = 185.5;
        s3.eyeColour = "grey";
        s3.age = 35;

        Course c3 = new Course();
        c3.courseName = "Trigonometry";
        c3.courseID = 789;
        c3.stream = "Mathematics";

        Payment p3 = new Payment();
        p3.amount = 3000;
        p3.modeOfPayment = "UPI";
        p3.paidBy = "Mother";

        s3.studentCourse = c3;
        s3.studentPayment = p3;

        s3.displayStudentInfo();

    }

}
