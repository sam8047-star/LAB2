public final class Alien extends Monster {

    public Alien(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " activates " + getSpecialPower());
    }
}

