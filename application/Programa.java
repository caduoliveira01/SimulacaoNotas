package application;

import java.util.Scanner;
import entities.Notas;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Notas notas = new Notas();

        System.out.println("Informe a primeira nota:");
        notas.n1=sc.nextDouble();

        System.out.println("Informe a segunda nota:");
        notas.n2=sc.nextDouble();

        System.out.println("Informe a terceira nota:");
        notas.n3=sc.nextDouble();

        System.out.println(notas);

        sc.close();
    }
}