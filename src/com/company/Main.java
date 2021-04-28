package com.company;

class Contact{
    private String name;
    private String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
class Business extends Contact{
    private String phone;


    public Business(String name, String email, String phone) {
        super(name, email);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + this.getName() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", phone='" + this.getPhone() + "\'" +
                '}';
    }
}



public class Main {

    public static void main(String[] args) {
        Contact guy = new Contact("Bob", "coolguy@gmail.com");
        Business girl = new Business("Emily", "briefcasegirl@gmail.com", "614-123-4567");

        System.out.println(guy.toString());
        System.out.println(girl.toString());
    }
}
