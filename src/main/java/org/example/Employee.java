package org.example;

public class Employee {
    private int id;
    private String name;
    private String phone;
    private int experience;

    public Employee(int id, String name, String phone, int experience) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return  id + "\t" + name + '\t' + phone + '\t' +
                experience;
    }
}
