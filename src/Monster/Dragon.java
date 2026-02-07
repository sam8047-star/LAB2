package Monster;

public class Dragon extends Monster {
    public Dragon(String name) {
        super(name);
    }

    @Override
    public void specialPowers(){
        System.out.println("fight powers");
    }
}

