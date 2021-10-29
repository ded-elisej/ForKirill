package Zoo.Vertebrateses;

public class Zebra extends NonPredators {
    String name;
    public Zebra (String name){
        this.name = name;
    }

    @Override
    public void whoIAm() {
        System.out.printf("I'm vertebrates, i'm non-predator. My name is %s.\n", name);
    }

    @Override
    public void iAmMoving() {
        System.out.println("I'm moving with 4 legs.");
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
    public void iAmNonPredator() {
        System.out.println("I eat grass. I don't hunt other animals.");
    }
}
