package Monster;

public class Alien extends Monster{
    public Alien (String name) {
        super(name);
    }

    @Override
    public void specialPowers(){
        System.out.println("speed");
    }
}


