package Zoo.Vertebrateses;

import Zoo.Water;

public class Penguin extends Birds implements Water {
    String name;
    public Penguin (String name){
        this.name = name;
    }

    @Override
    public void whoIAm() {
        System.out.printf("I am bird %s.\n",name);
    }

    @Override
    public void iAmBreathing() {
        System.out.println("I'm breath by air.");
    }

    @Override
    public void iAmMoving() {
        System.out.println("I move with my lower legs. Sometimes I swim.");
    }

    @Override
    public void iHaveSkeleton() {
        System.out.println("I'm vertebrates. I have skeleton.");
    }

    @Override
    public void iAmBird() {
        System.out.println("I'm bird, but i can't fly.");
    }

    @Override
    public void canYouSwim() {
        System.out.println("I can swim!");
    }
}
