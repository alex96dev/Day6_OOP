package de.neuefische;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(); // Student ist großgeschrieben, weil komplexer Datentyp


        student.alter = 25;
        student.studiengang = "Informatik";
        student.semster = 35;

        System.out.println(student.alter);
        System.out.println(student.studiengang);
        System.out.println(student.semster);
    }
}