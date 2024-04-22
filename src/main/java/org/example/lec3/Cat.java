package org.example.lec3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat extends Animal{


    Cat(String name, String color){
        super(name, color);
    }
    Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void voice() {
        System.out.println(name+ " мяукнул");
    }


}
