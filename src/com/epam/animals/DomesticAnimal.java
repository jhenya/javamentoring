package com.epam.animals;

class DomesticAnimal extends Animal {

    void voice(String str){
        System.out.println("Voice" + str);
        System.out.println("Voice" + str);
    }
    public void go(String str){
        System.out.println("GOGODom");
    }

    public void eat(){
        System.out.println("eat");
    }
    public void stop(){
        System.out.println("stop");
    }

}
