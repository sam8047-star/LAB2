package Monster;

public final class Fire extends Monster {

    public Fire(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " uses " + getSpecialPower());
    }
}