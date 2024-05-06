package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura");
        String nombre = sc.next();
        System.out.println("Ingrese el color de la figura");
        String color = sc.next();
        System.out.println("Ingrese el tipo de la figura"
                + "1.circulo"
                + "2.Rectángulo"
                + "3.Triángulo");
        int tipo = sc.nextInt();

        switch (tipo) {
            case 1:
                System.out.println("Ingrese el radio del Circulo.");
                double circle = sc.nextDouble();
                Circulo setradtio = new Circulo(circle);
                break;
            case 2:
                System.out.println("Ingrese los dos lados del Rectangulo.");
                System.out.println("Ingrese lado 1");
                double lad1 = sc.nextDouble();
                System.out.println("Ingrese lado 2");
                double lad2 = sc.nextDouble();
                Rectangulo setLados = new Rectangulo(lad1, lad2);
                break;

            case 3:
                System.out.println("Ingrese la base del Triangulo");
                double base = sc.nextDouble();
                System.out.println("Ingrese la altura del Triangulo");
                double altura = sc.nextDouble();
                Triangulo setpartes = new Triangulo(base, altura);
                break;

        }
    }
}
