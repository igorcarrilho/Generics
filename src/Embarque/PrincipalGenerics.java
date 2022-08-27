package Embarque;

import Controle.AeronaveGenerics;

import java.util.Scanner;

public class PrincipalGenerics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AeronaveGenerics<Integer> air = new AeronaveGenerics<>();
        System.out.println("Informe o número de aeronaves");
        int nrAeronaves = sc.nextInt();

        //Adicionando voos
        for(int i = 0; i < nrAeronaves; i++){
            Integer nrVoo = sc.nextInt();
            air.addVoo(nrVoo);
        }
        air.primeiroVoo();
        Integer x = (Integer) air.primeiroVoo();
        System.out.println("O primeiro a decolar é o voo: " + x);
        air.listaVoo();
        sc.close();
    }
}
