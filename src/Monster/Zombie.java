package Monster;

public class Zombie extends Monster{
    public Zombie(String name) {
        super(name);
    }

    @Override
    public void specialPowers(){
        System.out.println("super strength");
    }
}

