package com.mycompany.figurasgeometricaspoo;

class Circulo extends FigurasGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    double calcularArea() {
        return Math.PI * radio * radio;
    }
}


