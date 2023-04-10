/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Orlan
 */
public class Main {
    public static void main(String[] args) {
        Camisa camisa1 = new Camisa(1, "Camisas de manga corta", 190);
        Camisa camisa2 = new Camisa(2, "Camisas casual de manga larga", 230);
        Camisa camisa3 = new Camisa(3, "Camisas formal de manga larga", 310);
        Camisa[] camisas = { camisa1, camisa2, camisa3 };
        Tienda tienda = new Tienda(camisas);
        Scanner scanner = new Scanner(System.in);
        int[] cantidadCamisas = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la cantidad de " + camisas[i].getNombre() + " que desea comprar: ");
            cantidadCamisas[i] = scanner.nextInt();
        }
        scanner.close();
        
        double costoTotal = tienda.calcularCostoTotal(cantidadCamisas);
        System.out.println("El costo total es: $" + costoTotal);
                }
    }

