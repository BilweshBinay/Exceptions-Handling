package com.exception.builtin.bankdto;

public class AccountDetailsDto {
    private int id;
    private String sccountHolderName;
    private double amount;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSccountHolderName() {
        return sccountHolderName;
    }

    public void setSccountHolderName(String sccountHolderName) {
        this.sccountHolderName = sccountHolderName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
