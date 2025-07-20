package co.gabrielmilanez;

import java.util.Arrays;

public class ordenacao {

    public static void main(String[] args){
        int[] numbers = new int[]{1, 35, 14, 88, 6, 8, 9};
        Arrays.sort(numbers);
        System.out.println(numbers); // hashcode do objeto -> identificador

        System.out.println(Arrays.toString(numbers)); // imprime a sequência de forma ordenada
    }
}
