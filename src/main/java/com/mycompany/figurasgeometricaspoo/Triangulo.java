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
}

