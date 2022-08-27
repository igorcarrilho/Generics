package Controle;

import java.util.ArrayList;
import java.util.List;

public class AeronaveGenerics<T> {
    private List<T> listaAeronaves = new ArrayList<>();

    public void addVoo(T nrVoo){
        //listaAeronaves.add("3520");
        listaAeronaves.add(nrVoo);
    }

    public T primeiroVoo(){
        if(listaAeronaves.isEmpty()){
            throw new IllegalStateException("List is Empty");
        }
        return listaAeronaves.get(0);
    }
    public void listaVoo(){
        System.out.println("[");
        if(!listaAeronaves.isEmpty()){
            System.out.println(" " + listaAeronaves.get(0));
        }
        for(int i = 1; i < listaAeronaves.size(); i++){
            System.out.println(" " + listaAeronaves.get(i));
        }
        System.out.println("]");
    }
}
