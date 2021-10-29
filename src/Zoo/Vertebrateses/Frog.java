package Zoo.Vertebrateses;

public class Frog extends Amphibians {
    String name;
    public Frog (String name){
        this.name = name;
    }

    @Override
    public void whoIAm() {
        System.out.printf("I am amphibians %s.\n",name);
    }

    @Override
    public void iAmBreathing() {
        System.out.println("I'm breath by air.");
    }

    @Override
    public void iAmMoving() {
        System.out.println("I usually jump with my paws.");
    }

    @Override
    public void iHaveSkeleton() {
        System.out.println("I'm vertebrates. I have skeleton.");
    }

    @Override
    public void iAmAmphibians() {
        System.out.println("Hi, i'm amphibian.");
    }
}

