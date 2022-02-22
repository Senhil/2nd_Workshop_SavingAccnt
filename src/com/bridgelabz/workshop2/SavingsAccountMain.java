package com.bridgelabz.workshop2;

public class SavingsAccountMain {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        SavingsAccount.ModifyInterestRate(0.04);
        saver1.CalculateMonthlyInterest();
        saver2.CalculateMonthlyInterest();
        System.out.println("New Balance for Saver1: " + saver1.getSavingsBalance());
        System.out.println("New Balance for Saver2: " + saver2.getSavingsBalance());

        SavingsAccount.ModifyInterestRate(0.05);
        saver1.CalculateMonthlyInterest();
        saver2.CalculateMonthlyInterest();
        System.out.println("New Balance for Saver1: " + saver1.getSavingsBalance());
        System.out.println("New Balance for Saver2: " +saver2.getSavingsBalance());
    }
}
