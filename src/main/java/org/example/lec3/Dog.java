package org.example.lec3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog extends Animal{

    Dog(String name, String color) {
        super(name, color);
    }

    Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void voice(){
        System.out.println(name + " гавкнул");
    }
}
