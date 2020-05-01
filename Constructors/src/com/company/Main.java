package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount abcAccount = new BankAccount (55544, 0.00,"ABC","abc@abc.com",556611224);

        System.out.println("abc = " + abcAccount.getCustomerName());
        System.out.println("abc = " + abcAccount.getAccountNumber());

        abcAccount.depositFunds(500);
        abcAccount.withdrawFunds(100);

        abcAccount.depositFunds(1000);
        abcAccount.withdrawFunds(600);

        BankAccount mnoAccount = new BankAccount();
        System.out.println("mno = " + mnoAccount.getAccountNumber());

        BankAccount xyzAccount = new BankAccount("xyz", "abc" , 5555);
        System.out.println("xyz = " + xyzAccount.getBalance());

    }
}
