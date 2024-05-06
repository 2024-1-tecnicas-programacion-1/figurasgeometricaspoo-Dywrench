package com.mycompany.figurasgeometricaspoo;

class Circulo extends FigurasGeometrica {

    private double radio;
    private double perimetro;

    public Circulo(double radio) {
        this.radio = radio;
        this.perimetro=perimetro;
    }

    double calcularArea() {
        return Math.PI * radio * radio;

    }
    double calcularPerimetro(){
    return 2 * Math.PI * radio;
    }
}
