package com.epam.animals;

class Dog extends DomesticAnimal {

    @Override
    void voice(String str){
        System.out.println("Voice" + str);
    }

    public void go(){
        System.out.println("GOGO");
    }

    public void go(int dist){
        System.out.println("GOGO");
    }



}
