/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Orlan
 */
public class Tienda {
     private Camisa[] camisas;
    private DescuentoEnum descuento;
    public Tienda(Camisa[] camisas) {
        this.camisas = camisas;
    }

    public double calcularCostoTotal(int[] cantidadCamisas) {
        double costoTotal = 0;
        for (int i = 0; i < cantidadCamisas.length; i++) {
            Camisa camisa = camisas[i];
            int cantidad = cantidadCamisas[i];
            double precio = camisa.getPrecio();
            DescuentoEnum descuento = DescuentoEnum.obtenerDescuento(cantidad);
            double cantidadDescuento = descuento.getCantidadDescuento();
            double descuentoAplicado = precio * cantidadDescuento;
            double precioConDescuento = precio - descuentoAplicado;
            costoTotal += precioConDescuento * cantidad;
        }
        return costoTotal;
    }

    public void setDescuento(DescuentoEnum descuento) {
        this.descuento = descuento;
    }
    public DescuentoEnum getDescuento() {
    return descuento;
}

}
