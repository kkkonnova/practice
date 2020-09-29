package ru.ssau.tk.kkkonnova.practice_str;

public class MyStringClass {

    boolean differInRegister(String s1, String s2) {

        return s1.equalsIgnoreCase(s2) && !s1.equals(s2);
    }

    static int findFirstInSecond(String str1, String str2) {
        return str2.indexOf(str1);
    }

    static int findFirstInSecondTwo(String str1, String str2){
        return str2.lastIndexOf(str1,str2.length()/2);
    }

    static int findFirstInSecondToo(String str1, String str2) {
        return str2.indexOf(str1,str2.length()/2);
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

    }

    static void escapeCharacter() {
        int i = 0;
        //табуляция
        System.out.println("Символ\t№" + ++i);
        //удаление последнего элемента в строке
        System.out.println("Символ\b№" + ++i);
        //переход на новую строку
        System.out.println("Символ\n№" + ++i);
        //игнорирование текста до \r
        System.out.println("Символ\r№" + ++i);
        //символ '
        System.out.println("Символ\'№" + ++i);
        //символ "
        System.out.println("Символ\"№" + ++i);
        // символ /
        System.out.println("Символ\\№" + ++i);
    }
    */
}