package com.repetition_fixed.atm;

public class ATMImpl implements ATM{

    @Override
    public void payment() {
        System.out.println("How much money would you like to cash in?");
    }

    @Override
    public void withdrawal() {
        System.out.println("How much money would you like to withdraw?");

    }
}
