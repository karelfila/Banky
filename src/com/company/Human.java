package com.company;

public class Human {

    private String name;
    private String secondName;
    private String lastName;


    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {

        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {

        if(!secondName.equals("")){
         return name + " " + secondName + " " + lastName;
        } else {
            return name + " " + secondName + lastName;
        }
    }
}
