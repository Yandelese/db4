package kz.bitlab;

import java.util.ArrayList;

public class Footballer {

    Long id;
    String name;
    String surname;
    int salary;
    String club;
    int transferPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getTransferPrice() {
        return transferPrice;
    }

    public void setTransferPrice(int transferPrice) {
        this.transferPrice = transferPrice;
    }

    public Footballer(Long id, String name, String surname, int salary, String club, int transferPrice) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.club = club;
        this.transferPrice = transferPrice;
    }

    void addFootballer(Footballer footballer){
        footballer.addFootballer(footballer);
    }

    ArrayList getAllFootballers(ArrayList<Footballer> footballerArrayList) {
        return getAllFootballers(footballerArrayList);
    }
}



