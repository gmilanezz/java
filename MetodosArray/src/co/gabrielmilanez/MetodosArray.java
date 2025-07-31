package co.gabrielmilanez;

import java.util.ArrayList;
import java.util.List;

public class MetodosArray {

    public static void main(String[] args){

        // como add nomes no array:
        List<String> names = new ArrayList<>();
        names.add("Nome 1");
        names.add("Nome 1");
        names.add("Nome 1");
        names.add("Nome 1");

        // como buscar um elemento específico pelo índice get
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        // buscar indice a partir de um elemento
        System.out.println(names.indexOf("Nome 2"));

        // ver se a lista ta vazia
        System.out.println(names.isEmpty());

        //verifica se a lista contém algum elemento
        System.out.println(names.contains("Nome 14"));

        //verifica quantos indices tem na lista
        System.out.println(names.size());

        //limpa de vez a lista
        names.clear();
        System.out.println(names.isEmpty());
    }
}
