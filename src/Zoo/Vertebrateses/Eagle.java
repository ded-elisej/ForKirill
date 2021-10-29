package Zoo.Vertebrateses;

import Zoo.Flying;

public class Eagle extends Birds implements Flying {
    String name;
    public Eagle (String name){
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
        System.out.println("I usually fly with my wings.");
    }

    @Override
    public void iHaveSkeleton() {
        System.out.println("I'm vertebrates. I have skeleton.");
    }

    @Override
    public void iAmBird() {
        System.out.println("I'm bird.");
    }

    @Override
    public void canIFly() {
        System.out.println("I can fly!");
    }
}
