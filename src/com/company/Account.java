package com.company;

public class Account {

    private String accnumber;
    private int money;
    private Human user;
    private int password;
    private Bank accBank;

    public void setAccnumber(String accnumber) {
        this.accnumber = accnumber;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setAccBank(Bank accBank) {
        this.accBank = accBank;
    }

    public String getAccnumber() {
        return accnumber;
    }

    public int getMoney() {
        return money;
    }

    public void setUser(Human user) {
        this.user = user;
    }

    public Human getUser() {
        return user;
    }

    public int getPassword() {
        return password;
    }
    public Bank getAccBank() {
        return accBank;
    }
    public String getLongAccNumber(){
        return accnumber + accBank.getBankId();
    }
}
