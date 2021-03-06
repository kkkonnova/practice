package ru.ssau.tk.kkkonnova.practice_str;

import java.nio.charset.Charset;

public class MyStringClass {

    static String getNewCharset(String str, Charset newCharset, Charset oldCharset){
        byte[] byteString = str.getBytes(oldCharset);
        return new String(byteString,newCharset);
    }

    //доделать 3.21
    static String modifyAString(String str) {

        StringBuilder string = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            string.replace(i, i, "" + i);
            i++;
        }
        return string.reverse().toString();
    }

    static String listUpX(int x) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < x; i++) {
            str.append(i);
            str.append(" ");
        }
        return str.toString().trim();
    }

    static String concatenateStrings(String[] strs) {
        return String.join(", ", strs);
    }

    static String getSubstring(String str, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > str.length()) {
            to = str.length();
        }
        if (to <= from) {
            return "";
        }
        return str.substring(from, to);
    }

    static int getPrefixPostfixCountToo(String[] strings, String prefix, String postfix) {
        int count = 0;
        for (String string : strings) {
            if (string.trim().startsWith(prefix) & string.trim().endsWith(postfix)) {
                count++;
            }
        }
        return count;

    }

    static int findFirstInSecond(String str1, String str2) {
        return str2.indexOf(str1);
    }

    static int getPrefixPostfixCount(String[] strings, String prefix, String postfix) {
        int count = 0;
        for (String string : strings) {
            if (string.startsWith(prefix) & string.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    static int findFirstInSecondTwo(String str1, String str2) {
        return str2.lastIndexOf(str1, str2.length() / 2);
    }

    static int findFirstInSecondToo(String str1, String str2) {
        return str2.indexOf(str1, str2.length() / 2);
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