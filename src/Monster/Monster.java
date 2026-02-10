public abstract sealed class Monster
        permits Dragon, Alien, Zombie, Fire {

    private String name;
    private int health;
    private int attackPower;
    private SpecialPower specialPower;

    public Monster(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public SpecialPower getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(SpecialPower specialPower) {
        this.specialPower = specialPower;
    }

    public abstract void specialPowers();

    @Override
    public String toString() {
        return "Monster{" +
                "type=" + this.getClass().getSimpleName() + ", name='" + name + '\'' + ", health=" + health + ", attackPower=" + attackPower + '}';
    }
}

