public class Zombie extends Monster {

    public Zombie(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " uses " + getSpecialPower());
    }
}
