package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Compare {

    public static void main(String[] args){

        List<Human> sortorder = Arrays.asList(new Human("FLIGHTS",1),new Human("TRAINS",1),
                    new Human("FLIGHTS",11),new Human("TRAINS",11));

        Consumer<Human> printConsumer = new Consumer<Human>() {
            @Override
            public void accept(Human s) {
                System.out.println(s);
            }
        };

         sortorder.stream().sorted(Comparator.comparing(Human::getName).reversed().thenComparing(Human::getAge)).forEach(printConsumer);

    }

}
