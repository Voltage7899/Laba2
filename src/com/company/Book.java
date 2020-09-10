package com.company;
import java.lang.*;

public class Book
{
    private String name;
    private String author;
    private int pages;

    public Book(String n,String a,int p)
    {
        name=n;
        author=a;
        pages=p;
    }
    public Book()
    {
        name="noname";
        author="noname";
        pages=0;
    }
    public void setInfo(String name,String author,int pages)
    {
        this.name=name;
        this.author=author;
        this.pages=pages;
    }
    public String getName(String name)
    {
        return name;
    }
    public String getAuthor(String author)
    {
        return author;
    }
    public int getPages(int pages)
    {
        return pages;
    }
    public String toString()
    {
        return this.name+"has"+this.pages;
    }
    public void infoBook()
    {
        System.out.println(author+"have written"+name);
    }
}
