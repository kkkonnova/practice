package ru.ssau.tk.kkkonnova.practice_str;

public class MyStringClass {

    public static void main(String[] args) {

        String s1 = "123";
        String s2 = "PAPA";
        MyStringClass MyString = new MyStringClass();
        boolean res = MyString.differInRegister(s1, s2);
        System.out.println(res);
    }

    boolean differInRegister(String s1, String s2) {
        return s1.equalsIgnoreCase(s2) && !s1.equals(s2);
    }

    boolean palindromeCheck(String myString) {
        String palindrome = new StringBuilder(myString).reverse().toString();
        return myString.equals(palindrome);
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

    /*
    void checkingStrings() {
        String s1 = "S";
        String s2 = new String(s1);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    } */
}