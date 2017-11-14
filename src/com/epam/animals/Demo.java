package com.epam.animals;

public class Demo {
    public static void main(String args[]){
        DomesticAnimal da = new Dog();
        String str = "voiuce";
        da.eat();
        da.stop();
        da.voice(str);
        da.go(str);

        Dog daDog = new Dog();
        daDog.go(str);
        daDog.go();
    }
}
