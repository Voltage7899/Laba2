package com.company;

public class TestBook {
    public static void main(String[] args)
    {
        Book d1=new Book("Garry","Rouling",7000);
        Book d2=new Book();
        d2.setInfo("50Grey","Djonson",5000);
        System.out.println(d1);
        d2.infoBook();


    }




}