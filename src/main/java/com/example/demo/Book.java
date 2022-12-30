package com.example.demo;

public class Book {
    String name;
    String detail;
    int  id;
    public Book(String name,String detail,int id){
        this.name=name;
        this.detail=detail;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

}
}
