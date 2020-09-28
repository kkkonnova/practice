package ru.ssau.tk.kkkonnova.practice_str;

public class MyStringClass {

    void splitLine(String myString) {
        for (int i = 0; i < myString.length(); i++) {
            System.out.println(myString.charAt(i));
        }
    }


    public static void main(String[] args) {

        String s1 = "123fgh123!";
        MyStringClass MyString = new MyStringClass();
        MyString.splitLine(s1);
    }

}