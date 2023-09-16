package examples.listing10_1_2;

public class Loan {
    private double annualInterestRate;
    private int numberOfYear;
    private double loanAmmount;
    private java.util.Date loanDate;

    public Loan () {
        this (2.5, 1, 100);
    }

    public Loan(double annualInterestRate, int numberOfYear, double loanAmmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYear = numberOfYear;
        this.loanAmmount = loanAmmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

    public double getLoanAmmount() {
        return loanAmmount;
    }

    public void setLoanAmmount(double loanAmmount) {
        this.loanAmmount = loanAmmount;
    }

    // find monthly payment
    public double getMonthlyPayment () {
        double monthlyInterestRate =  annualInterestRate / 1200;
        double monthlyPayment = loanAmmount * monthlyInterestRate / (1 -(1/Math.pow(1 + monthlyInterestRate, numberOfYear * 12)));

        return monthlyPayment;
    }

    // find total payment
    public double getTotalPayment () {
        double totalPayment =  getMonthlyPayment() * numberOfYear * 12;
        return  totalPayment;
    }

    // return loan date
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
