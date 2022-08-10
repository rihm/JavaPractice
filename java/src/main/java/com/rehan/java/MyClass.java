package com.rehan.java;

public class MyClass {
    private int id;
    private String name;

    public MyClass(){
        this("rehan",2);
        System.out.println("Default  Created");
        System.out.println("No-Arg Constructor...");
    }
    public MyClass(int i){
        this("rehan",i);
        System.out.println("Employee Created with Default Name");
    }
    public MyClass(String str, int i){
        this.id=i;
        this.name=str;
        System.out.println("Employee Created");

    }
    public  MyClass MyClass(){
        System.out.println("my Class method");
        return new MyClass();
    }
public static void main(String[] arg){
        System.out.println("hiiiii");
        MyClass obj= new MyClass();
        obj.MyClass();

}


}