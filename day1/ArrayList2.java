package day1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> firstFivePrime =new ArrayList<>();
        firstFivePrime.add(2);
        firstFivePrime.add(3);
        firstFivePrime.add(5);
        firstFivePrime.add(7);
        firstFivePrime.add(11);


    List<Integer> firstTenPrime=new ArrayList<>(firstFivePrime);

    List<Integer> nextFivePrime =new ArrayList<>();
        nextFivePrime.add(13);
        nextFivePrime.add(17);
        nextFivePrime.add(19);
        nextFivePrime.add(23);
        nextFivePrime.add(29);

        firstTenPrime.addAll(nextFivePrime);
        System.out.println(firstTenPrime);

    }
}
