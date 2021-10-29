package Zoo.Vertebrateses;

import Zoo.Water;

public class Carp extends Fish implements Water {
    String name;
    public Carp (String name){
        this.name = name;
    }

    @Override
    public void whoIAm() {
        System.out.printf("I am fish %s.\n",name);
    }

    @Override
    public void iAmBreathing() {
        System.out.println("I am breathing with gills.");
    }

    @Override
    public void iAmMoving() {
        System.out.println("I swim in water.");
    }

    @Override
    public void iHaveSkeleton() {
        System.out.println("I'm vertebrates. I have sceleton.");
    }

    @Override
    public void canYouSwim() {
        System.out.println("I can swim!");
    }
}
