package co.gabrielmilanez;

import java.util.Arrays;

public class PreenchendoArrays {

    public static void main(String[] args){
        String[] nomes = new String[10];
        System.out.println(Arrays.toString(nomes));
        Arrays.fill(nomes, "Milanez");

        System.out.println(Arrays.toString(nomes));
    }
}
