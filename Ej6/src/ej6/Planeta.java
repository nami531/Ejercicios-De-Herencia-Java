/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ej6;

/**
 *
 * @author a21nadiami
 */
public enum Planeta {
    MERCURIO(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    TERRA(5.976e+24, 6.37814e6),
    MARTE(6.421e+23, 3.3972e6),
    XUPITER(1.9e+27, 7.1492e7),
    SATURNO(5.688e+26, 6.0268e7),
    URANO(8.686e+25, 2.5559e7),
    NEPTUNO(1.024e+26, 2.4746e7);
    private final double masa; // en kilogramos
    private final double radio; // en metros

    Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    private double masa() {
        return masa;
    }

    private double radio() {
        return radio;
    }
    // constante gravitacional universal (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;

    double gravidadeSuperficie() {
        return G * masa / (radio * radio);
    }

    double pesoSuperficie(double otraMasa) {
        return otraMasa * gravidadeSuperficie();
    }
}
