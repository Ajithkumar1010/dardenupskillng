package day1;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("lion");
        animals.add("tiger");
        animals.add("elephant");
        animals.add("dog");
        System.out.println(animals);

        animals.add(1,"deer");
        System.out.println(animals);

        animals.remove(1);
        System.out.println(animals);

        animals.set(1,"deer");
        System.out.println(animals);

        for(String i:animals){
            System.out.println(i);
        }
    }
}
