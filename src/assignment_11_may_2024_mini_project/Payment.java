package assignment_11_may_2024_mini_project;

public class Payment {

    double amount;
    String paidBy;
    String modeOfPayment;

    public void cash() {
        System.out.println("Cash is the mode of payment");
    }

    public void card(int cardNo) {
        System.out.println("Card is the mode of payment");
    }

    public int paymentId() {
        return 101;
    }

    public String paidBy(String personName) {
        return personName;
    }

}
