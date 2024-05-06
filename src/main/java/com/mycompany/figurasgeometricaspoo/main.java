package com.mycompany.figurasgeometricaspoo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("#,##0.00", symbols);
        System.out.println("Ingrese el nombre de la figura");
        String nombre = sc.next();
        System.out.println("Ingrese el color de la figura");
        String color = sc.next();
        System.out.println("Ingrese el tipo de la figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        int tipo = sc.nextInt();

        switch (tipo) {
            case 1:
                System.out.println("Ingrese el radio del círculo:");
                double radiocirculo = sc.nextDouble();
                Circulo circle = new Circulo(radiocirculo);
                System.out.println("Área del círculo: " + df.format(circle.calcularArea()));
                System.out.println("El perimetro del círculo es: " + df.format(circle.calcularPerimetro()));
                break;
            case 2:
                System.out.println("Ingrese los dos lados del rectángulo:");
                System.out.println("Ingrese el primer lado del rectángulo");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el segundo lado del rectángulo");
                double lado2 = sc.nextDouble();
                Rectangulo rectangle = new Rectangulo(lado1, lado2);
                System.out.println("Área del rectángulo: " + df.format(rectangle.calcularArea()));
                System.out.println("Perimetro del rectangulo: " + df.format(rectangle.perimetroRect()));
                break;
            case 3:
                System.out.println("Ingrese la base del triángulo:");
                double base = sc.nextDouble();
                System.out.println("Ingrese la altura del triángulo:");
                double altura = sc.nextDouble();
                Triangulo triangle = new Triangulo(base, altura);
                System.out.println("Área del triángulo: " + df.format(triangle.calcularArea()));
                System.out.println("Perimetro del triángulo:" + df.format(triangle.perimetroTriangulo()));
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una figura válida.");
        }

    }
}
