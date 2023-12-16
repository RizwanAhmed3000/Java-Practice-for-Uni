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

    // =================POLYMORPHISM(function overloading)======================//
    /*
     * fucntion with same name and same return type but using different types of
     * parameters
     * 
     * same return type different parameters
     * same parameters different return type
     * same return type and same type parameters then different numbers of
     * parameters
     */
    public void printInfo(int numOfYear) {
        System.out.println(numOfYear);
    }

    public void printInfo(double loanAmount) {
        System.out.println(loanAmount);
    }

    public void printInfo(double loanAmount, int numOfYear) {
        System.out.println(loanAmount + " " + numOfYear);
    }
}
