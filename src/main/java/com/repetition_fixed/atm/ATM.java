package com.repetition_fixed.atm;

public interface ATM {
    public void payment();
    public void withdrawal();

    public default String isConnected() {
        return "Connected to the bank";
    }

    public static void finished() {
        System.out.println("Have a nice day");
    }

}
