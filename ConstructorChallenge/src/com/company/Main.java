package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer a = new VipCustomer("gugu",500,"sad@dass");
        System.out.println(a.getName());
        System.out.println(a.getEmailAddress());
        System.out.println(a.getCreditLimit());

        VipCustomer b = new VipCustomer("lolo",800);
        System.out.println(b.getName());
        System.out.println(b.getCreditLimit());
        System.out.println(b.getEmailAddress());

        VipCustomer c = new VipCustomer();
        System.out.println(c.getEmailAddress());
        System.out.println(c.getCreditLimit());
        System.out.println(c.getName());
    }
}
