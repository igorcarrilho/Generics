package Embarque;
import Controle.Aeronaves;

import java.util.Scanner;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Aeronaves air = new Aeronaves();
        System.out.println("Informe o número de aviões");
        int nrAvioes = sc.nextInt();

        //Adicionando voos
        for(int i = 0; i < nrAvioes; i++){
            int nrVoo = sc.nextInt();
            air.addVoo(nrVoo);
        }
        System.out.println("O primeiro a decolar vai ser o número: " + air.primerioVoo());
        sc.close();
    }
}
