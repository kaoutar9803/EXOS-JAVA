package org.example;

public class Exercice25 {
}
class Sports {
    public void play() {
        System.out.println("Playing a sport...");
    }
}

class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing football...");
    }
}

class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball...");
    }
}

class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing rugby...");
    }
}