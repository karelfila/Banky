package com.company;

import java.util.Scanner;

public class Main {

    // 65269100
    // 92492200
    // 65269300

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moneyDestination = "";
        String sentMoney;

        Bank kb = new Bank();
        kb.setBank("Komerční Banka");
        kb.setBankId("100");
        kb.setHeadquarters("Praha");

        Bank csob = new Bank();
        csob.setBank("Československá Obchodní Banka");
        csob.setBankId("200");
        csob.setHeadquarters("Praha");

        Bank cnb = new Bank();
        cnb.setBank("Česká Národní Banka");
        cnb.setBankId("300");
        cnb.setHeadquarters("Praha");

        Human pn = new Human();
        pn.setName("Petr");
        pn.setSecondName("");
        pn.setLastName("Novák");


        Human jeb = new Human();
        jeb.setName("Jaromír");
        jeb.setSecondName("Edvard");
        jeb.setLastName("Beneš");

        Account n1 = new Account();
        n1.setAccnumber("65269");
        n1.setMoney(95000);
        n1.setUser(pn);
        n1.setPassword(54284);
        n1.setAccBank(kb);

        Account n2 = new Account();
        n2.setAccnumber("92492");
        n2.setMoney(65321);
        n2.setUser(jeb);
        n2.setPassword(55861);
        n2.setAccBank(csob);

        Account n3 = new Account();
        n3.setAccnumber("65269");
        n3.setMoney(95000);
        n3.setUser(pn);
        n3.setPassword(49136);
        n2.setAccBank(cnb);




        String longAccNumber = n1.getAccnumber() + kb.getBankId();



        System.out.println("Enter password:");
        String inputPassword = sc.nextLine();

        int inputPasswordInt = Integer.parseInt(inputPassword);

        if (inputPasswordInt == n1.getPassword()) {
            System.out.println("Welcome " + n1.getUser().getFullName() + "!");
            System.out.println("Your money: " + n1.getMoney());
            System.out.println("------------------------");
            System.out.println("A) Send Money");
            System.out.println("B) Delete Account");
            System.out.println("C) Create Account");
            System.out.println("D) Withdraw or Deposit Money");
            String reply = sc.nextLine();

            if (reply.equals("A")) {
                System.out.println("Where do you want to send money? (Enter account number + Bank id)");
                moneyDestination = sc.nextLine();
                System.out.println("How much many do you want to send?");
                sentMoney = sc.nextLine();

                int sentMoneyInt = Integer.parseInt(sentMoney);
                if (sentMoneyInt > n1.getMoney()) {
                    System.out.println("You don't have enough money");
                } else {
                    if (moneyDestination.equals(n1.getLongAccNumber())) {
                        System.out.println("You cant send money to yourself");
                    }
                    if (moneyDestination.equals(n2.getLongAccNumber())) {
                        n1.setMoney(n1.getMoney() - sentMoneyInt);
                        n2.setMoney(n2.getMoney() + sentMoneyInt);
                        System.out.println("Your money has been sent");
                    }
                    if (moneyDestination.equals(n3.getLongAccNumber())) {
                        n1.setMoney(n1.getMoney() - sentMoneyInt);
                        n3.setMoney(n3.getMoney() + sentMoneyInt);
                        System.out.println("Your money has been sent");
                    }
                }
            }
            if (inputPasswordInt == n2.getPassword()) {
                System.out.println("Welcome " + n2.getUser().getFullName() + "!");
                System.out.println("Your money: " + n2.getMoney());
            }
            if (inputPasswordInt == n3.getPassword()) {
                System.out.println("Welcome " + n3.getUser().getFullName() + "!");
                System.out.println("Your money: " + n3.getMoney());
            }

        }
    }
}


