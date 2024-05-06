package com.mycompany.figurasgeometricaspoo;
import java.util.Scanner;

abstract class FiguraGeometrica {
    abstract double calcularArea();
}

// Clase para representar un círculo
class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase para representar un rectángulo
class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

   
    double calcularArea() {
        return lado1 * lado2;
    }
}

// Clase para representar un triángulo
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    double calcularArea() {
        return 0.5 * base * altura;
    }
}



