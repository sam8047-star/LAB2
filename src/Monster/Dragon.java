package Monster;

public final class Dragon extends Monster {

    public Dragon(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " uses " + getSpecialPower());
    }
}
