package com.example.SpringRest.demo.entities;

public class Department {
    Long dId;
    String name;
    int sno;

    public Long getdId() {
        return dId;
    }

    public void setdId(Long dId) {
        this.dId = dId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public Department(Long dId, String name, int sno) {
        this.dId = dId;
        this.name = name;
        this.sno = sno;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "dId=" + dId +
                ", name='" + name + '\'' +
                ", sno=" + sno +
                '}';
    }

}
