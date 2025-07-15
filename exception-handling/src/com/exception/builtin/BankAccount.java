package com.exception.builtin;

import com.exception.builtin.bankdto.AccountDetailsDto;

public class BankAccount {
    public static void main(String[] args) {
        AccountDetailsDto account = new AccountDetailsDto();
        account.setId(101);
        account.setSccountHolderName("Raju");
        account.setBalance(7000);
        account.setAmount(5000);

        try {
            withdrawAmount(account);
        } catch (IllegalArgumentException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }

        System.out.println("Final Balance: ₹" + account.getBalance());
    }

    public static void withdrawAmount(AccountDetailsDto account) {
        double amountToWithdraw = account.getAmount();
        double currentBalance = account.getBalance();

        if (amountToWithdraw > currentBalance) {
            throw new IllegalArgumentException("Insufficient balance! Available: ₹" + currentBalance);
        }

        double newBalance = currentBalance - amountToWithdraw;
        account.setBalance(newBalance);
        System.out.println("Withdrawal of ₹" + amountToWithdraw + " successful.");
    }

    public static class EmpAdmin {
    }
}
