package Zoo.Vertebrateses;

public class Tiger extends Predators {
    String name;
    public Tiger (String name){
        this.name = name;
    }

    @Override
    public String whoIAm() {
        String inform = "I'm vertebrates, i'm predator. My name is tiger.";
        return inform;
    }

    @Override
    public String iAmMoving() {
        String move = "I'm moving with 4 paws.";
        return move;
    }

    @Override
    public String iAmBreathing() {
        String breath = "I'm breathing by air.";
        return breath;
    }

    @Override
    public String iHaveSkeleton() {
        String skeleton = "I'm vertebrates. I have skeleton.";
        return skeleton;
    }

    @Override
    public String iAmMammals() {
        String type = "I'm mammals.";
        return type;
    }

    @Override
    public String iAmPredator() {
        String type2 = "I hunt other animals";
        return type2;
    }

    public String inform(){
        String informAboutThisAnimal = "Hi, i'm tiger. I am a striped predator. I live in India, China and Russia. Domestic cat is my close relative.";
        return informAboutThisAnimal;
    }
    public String toString(){
        return iHaveSkeleton() + iAmMammals() + iAmPredator() + inform();
    }
}
