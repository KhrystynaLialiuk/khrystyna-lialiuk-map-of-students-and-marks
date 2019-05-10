package com.map;

public class Student {
    private String firstName;
    private String surname;
    private String pesel;

    Student(String firstName, String surname, String pesel) {
        this.firstName = firstName;
        this.surname = surname;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        final Student e = (Student) o;
        return this.firstName.equals(e.firstName) && this.surname.equals(e.surname) && this.pesel.equals(e.pesel);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(pesel.substring(0,6));
    }

    @Override
    public String toString() {
        return firstName + " " + surname + " " + pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }
}