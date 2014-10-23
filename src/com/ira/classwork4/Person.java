package com.ira.classwork4;

/**
 * Created by Ira on 09.10.2014.
 */
public class Person {
    private final String firstName;
    private final String secondName;
    private final String mail;
    private final String phone;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.mail = builder.mail;
        this.phone = builder.phone;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getSecondName() {
        return secondName;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (!firstName.equals(person.firstName)) return false;
        if (!mail.equals(person.mail)) return false;
        if (!phone.equals(person.phone)) return false;
        if (!secondName.equals(person.secondName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + secondName.hashCode();
        result = 31 * result + mail.hashCode();
        result = 31 * result + phone.hashCode();
        return result;
    }


    public static class Builder {
        private String firstName;
        private String secondName;
        private String mail;
        private String phone;

        public Builder() {
        }

        public Builder(Person original) {
            this.firstName = original.firstName;
            this.secondName = original.secondName;
            this.mail = original.mail;
            this.phone = original.phone;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Builder mail(String mail) {
            this.mail = mail;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
