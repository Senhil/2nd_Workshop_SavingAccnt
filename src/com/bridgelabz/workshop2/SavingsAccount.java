package com.bridgelabz.workshop2;

public class SavingsAccount {
    public static double AnnualInterestRate;
    private double SavingBalance;

    public SavingsAccount() {
        AnnualInterestRate = 0.0;
        SavingBalance = 0.0;
    }

    public SavingsAccount(double intRate, double savBal) {
        AnnualInterestRate = intRate;
        SavingBalance = savBal;
    }

    public double CalculateMonthlyInterest() {
        double intRate = (SavingBalance * AnnualInterestRate / 12);
        SavingBalance = SavingBalance + intRate;
        return intRate;
    }

    public static void ModifyInterestRate(double NewInterestRate) {
        AnnualInterestRate = NewInterestRate;
    }

    public void setSavingsBalance(double newBal) {
        SavingBalance = newBal;
    }

    public double getSavingsBalance() {
        return SavingBalance;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }
}
