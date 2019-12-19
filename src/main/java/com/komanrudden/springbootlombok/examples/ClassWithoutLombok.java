package com.komanrudden.springbootlombok.examples;

import java.util.Objects;
import java.util.logging.Logger;

public class ClassWithoutLombok {

    Logger log = Logger.getLogger(ClassWithoutLombok.class.getSimpleName());

    public String firstName;
    public String surname;

    public ClassWithoutLombok() {}
    public ClassWithoutLombok(String firstName, String surname) {
        this.firstName = firstName;
        this.surname= surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void letsDemoLogging() {
        log.info(firstName + " " + surname);
    }

    @Override
    public String toString() {
        return "firstName=" + firstName + ", surname=" + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassWithoutLombok that = (ClassWithoutLombok) o;
        return getFirstName().equals(that.getFirstName()) &&
                getSurname().equals(that.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getSurname());
    }
}
