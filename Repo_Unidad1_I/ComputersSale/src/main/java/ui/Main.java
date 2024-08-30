package ui;

import model.ComputerSale;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        ComputerSale cs = new ComputerSale();
        boolean flag = false;
        while(!flag){
            System.out.println("1. Ordenar por marca - Ordenamiento inserción: sortByBrand()");
            System.out.println("2. Ordenar por RAM - Ordenamiento con ARRAYS y clase anónima: sortByRam()");
            System.out.println("3. Ordenar por Procesamiento - Ordenamiento con ARRAYS y clase en otro archivo: sortByProcessing()");
            int opt = reader.nextInt();
            switch (opt){
                case 1:
                    System.out.println("Arreglo antes de ordenar");
                    System.out.println(cs.showBrands());
                    cs.sortByBrand();
                    System.out.println("Arreglo después de ordenar");
                    System.out.println(cs.showBrands());
                    break;
                case 2:
                    System.out.println("Arreglo antes de ordenar");
                    System.out.println(cs.showRam());
                    cs.sortByRam();
                    System.out.println("Arreglo después de ordenar");
                    System.out.println(cs.showRam());
                    break;
                case 3:
                    System.out.println("Arreglo antes de ordenar");
                    System.out.println(cs.showProcessing());
                    cs.sortByProcessing();
                    System.out.println("Arreglo después de ordenar");
                    System.out.println(cs.showProcessing());
                    break;
            }
        }
    }

}
