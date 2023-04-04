package com.repetition_fixed.atm;

public class Application {
    public static void main(String[] args) {
        ATMImpl atm = new ATMImpl();
        System.out.println(atm.isConnected());
        atm.payment();
        atm.withdrawal();
        ATM.finished();
    }
}
