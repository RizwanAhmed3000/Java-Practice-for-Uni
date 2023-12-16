public class Loan {
    private double annualInterestRate;
    private int numOfYear;
    private double loanAmount;
    private java.util.Date loanDate;

    // =======================NO AURGS CONSTRUCTOR=========================//
    public Loan() {
        this(2.5, 1, 1000);
    }

    // =======================AURGS CONSTRUCTOR=========================//
    public Loan(double annualInterestRate, int numOfYear, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numOfYear = numOfYear;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    // ==============GET METHODS======================//
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumOfYear() {
        return numOfYear;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }

    // =====================SETTER METHODS===========================//

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumOfYear(int numOfYear) {
        this.numOfYear = numOfYear;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // =======================FIND MONTHLY PAYMENT=================//

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1 - 1 / (Math.pow(1 + monthlyInterestRate, numOfYear * 12)));
        return monthlyPayment;
    }

    // =================FIND TOTAL PAYMENT========================//

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numOfYear * 12;
        return totalPayment;
    }
}
