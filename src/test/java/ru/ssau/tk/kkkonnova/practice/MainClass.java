package ru.ssau.tk.kkkonnova.practice;

public class MainClass {

    public static void main(String[] args) {
        Person Marinochka = new Person();
        Marinochka.setFirstName("Marina");
        Marinochka.setLastName("Vershinina");
        Marinochka.setPassportId(361252482);

        Person Kiryusha = new Person();
        Kiryusha.setFirstName("Kirill");
        Kiryusha.setLastName("Konnov");
        Kiryusha.setPassportId(380107581);

        System.out.println(Marinochka.getFirstName() + ' ' + Marinochka.getLastName());
        System.out.println(Kiryusha.getFirstName() + ' ' + Kiryusha.getLastName());
    }
}
