/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Orlan
 */
public enum DescuentoEnum {
    CASO_1(0),
    CASO_2(0.05),
    CASO_3(0.08);

    private final double cantidadDescuento;

    DescuentoEnum(double cantidadDescuento) {
        this.cantidadDescuento = cantidadDescuento;
    }

    public double getCantidadDescuento() {
        return cantidadDescuento;
    }

    public static DescuentoEnum obtenerDescuento(int cantidadCamisas) {
        if (cantidadCamisas <= 2) {
            return CASO_1;
        } else if (cantidadCamisas >= 3 && cantidadCamisas <= 5) {
            return CASO_2;
        } else {
            return CASO_3;
        }
    }
}
