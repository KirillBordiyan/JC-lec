package org.example.lec3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class Animal {
    protected String name;
    protected String color;
    protected int age = 1;

    Animal(String name, String color){
        this.name=name;
        this.color=color;
    }

    Animal(String name, String color, int age){
        this(name, color);
        this.age = age;
    }

    abstract void voice();

}
