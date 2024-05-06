package com.mycompany.figurasgeometricaspoo;


class Triangulo extends FigurasGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return 0.5 * base * altura;
    }

    double tercerLado() {
        double tercerLado = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return tercerLado;
    }

    double perimetroTriangulo() {
        double tercerLado = tercerLado(); // Calculamos el tercer lado
        return base + altura + tercerLado;
    }
}