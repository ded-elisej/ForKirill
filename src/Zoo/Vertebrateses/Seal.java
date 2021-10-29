package Zoo.Vertebrateses;

import Zoo.Water;

public class Seal extends Predators implements Water {
    String name;
    public Seal (String name){
        this.name = name;
    }

    @Override
    public void whoIAm() {
        System.out.printf("I'm vertebrates, i'm predator. My name is %s.\n", name);
    }

    @Override
    public void iAmMoving() {
        System.out.println("I'm moving with fins and tail.");
    }

    @Override
    public void iAmBreathing() {
        System.out.println("I'm breathing by air.");
    }

    @Override
    public void iHaveSkeleton() {
        System.out.println("I'm vertebrates. I have skeleton.");
    }

    @Override
    public void iAmMammals() {
        System.out.println("I'm mammals.");
    }

    @Override
    public void iAmPredator() {
        System.out.println("I hunt other fish and animals");
    }

    @Override
    public void canYouSwim() {
        System.out.println("I can swim!");
    }
}
