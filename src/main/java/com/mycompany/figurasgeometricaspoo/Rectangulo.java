package com.mycompany.figurasgeometricaspoo;

class Rectangulo extends FigurasGeometrica {
    private double lado1;
    private double lado2;

    public  Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

   
    double calcularArea() {
        return lado1 * lado2;
    }
    double perimetroRect (){
    return 2 * (lado1 + lado2);
    
    }
}

