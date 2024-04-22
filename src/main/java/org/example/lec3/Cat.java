package org.example.lec3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat {
    final String name;
    String color;
    int age = 1;

    Cat(String name, String color){
        this.name = name;
        this.color = color;
    }
    Cat(String name, String color, int age) {
        this(name, color);
        this.age = age;
    }

    void voice(){
        System.out.println(name + " мяукнул");
    }
}
