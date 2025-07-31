package co.gabrielmilanez;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SobreCargaDeMetodos {

    public static void main(String[] args){
        List<String> names = new ArrayList<>();

        names.add("Nome 7");
        names.add("Nome 5");
        names.add("Nome 3");
        names.add("Nome 4");

        Collections.sort(names);

        for(String name : names){
            System.out.println(name);
        }
    }
}
