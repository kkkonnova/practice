package ru.ssau.tk.kkkonnova.practice_str;

public class MyStringClass {

    public static void main(String[] args) {

        String s1 = "Кристина";
        String s2 = "Stas";
        MyStringClass MyString = new MyStringClass();
        //  MyString.getStringBytes(s1);
        //  MyString.getStringBytes(s2);
        MyString.checkingStrings();
    }

    void splitLine(String myString) {
        for (int i = 0; i < myString.length(); i++) {
            System.out.println(myString.charAt(i));
        }
    }

    void getStringBytes(String myString) {
        byte[] stringBytes = myString.getBytes();
        for (int bytes : stringBytes) {
            System.out.println(bytes);
        }

    }

    void checkingStrings() {
        String s1 = "S";
        String s2 = new String(s1);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }

}