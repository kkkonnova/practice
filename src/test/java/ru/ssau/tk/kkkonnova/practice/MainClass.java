package ru.ssau.tk.kkkonnova.practice;

public class MainClass {

    public static void main(String[] args) {

        Person Kristina = new Person();
        Person Kiryusha = new Person("Kirill", "Konnov");
        Person Stas = new Person(380107581);
        Person Marinochka = new Person("Marina","Vershinina",361252482);

        System.out.println(Kristina.getFirstName() + ' ' + Kristina.getLastName() + ' '+ Kristina.getPassportId());
        System.out.println(Kiryusha.getFirstName() + ' ' + Kiryusha.getLastName() + ' '+ Kiryusha.getPassportId());
        System.out.println(Stas.getFirstName() + ' ' + Stas.getLastName() + ' '+ Stas.getPassportId());
        System.out.println(Marinochka.getFirstName() + ' ' + Marinochka.getLastName() + ' '+ Marinochka.getPassportId());
    }
}
