package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    private String firstname;
    private String lastname;
    private String peselId;

    public LibraryUser(String firstname, String lastname, String peselId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPeselId() {
        return peselId;
    }

    public void setPeselId(String peselId) {
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;

        LibraryUser libraryUser = (LibraryUser) object;

        return Objects.equals(this.getFirstname(), libraryUser.getFirstname()) &&
                Objects.equals(this.getLastname(), libraryUser.getLastname()) &&
                Objects.equals(this.getPeselId(), libraryUser.getPeselId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getFirstname(), this.getLastname(), this.getPeselId());
    }
}
