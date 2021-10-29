package Zoo.Vertebrateses;

public class Snake extends Reptiles {
    String name;
    public Snake (String name){
        this.name = name;
    }

    @Override
    public void whoIAm() {
        System.out.printf("I am reptiles %s.\n",name);
    }

    @Override
    public void iAmBreathing() {
        System.out.println("I'm breath by air.");
    }

    @Override
    public void iAmMoving() {
        System.out.println("I move with my body without legs.");
    }

    @Override
    public void iHaveSkeleton() {
        System.out.println("I'm vertebrates. I have skeleton.");
    }

    @Override
    public void iAmReptiles() {
        System.out.println("Hi, i'm reptile.");
    }
}
