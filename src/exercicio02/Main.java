package exercicio02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        System.out.println("Informe as coordenadas do ponto 1 : ");
        p1.x = sc.nextDouble();
        p1.y = sc.nextDouble();
        System.out.println("\nInforme as coordenadas do ponto 2 : ");
        p2.x = sc.nextDouble();
        p2.y = sc.nextDouble();

        System.out.println("Distância de p1 para p2: "+ df.format(p1.calcularDist(p2)));
        System.out.println("Distância de p2 para p1: "+ df.format(p2.calcularDist(p1)));

        System.out.println("\nDistância do p1 até a origem: "+ df.format(p1.calcularDistAteOrigem()));
        System.out.println("\nDistância do p2 até a origem: "+ df.format(p2.calcularDistAteOrigem()));

        Ponto aux = Ponto.maisProximoDaOrigem(p1, p2);
        System.out.println("\nO ponto que está mais próximo da origem é o ponto: "+ aux.formatarPonto());

        p1.formatarPonto();
        p2.formatarPonto();
    }
}
