public class Main {

    public static void main(String[] args) {
        Monster m1 = new Dragon("Dragon", 200, 50);
        Monster m2 = new Alien("Bart", 150, 40);
        Monster m3 = new Zombie("Zombie", 120, 25);
        Monster m4 = new Fire("Blaze", 180, 45);
        Monster m5 = new Dragon("Dragon 2", 220, 60);

        m1.setSpecialPower(SpecialPower.FIRE_BREATH);
        m2.setSpecialPower(SpecialPower.TELEPATHY);
        m3.setSpecialPower(SpecialPower.REGENERATION);
        m4.setSpecialPower(SpecialPower.FLIGHT);
        m5.setSpecialPower(SpecialPower.POISON_ATTACK);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);

        System.out.println("\nSpecial Powers:");

        m1.specialPowers();
        m2.specialPowers();
        m3.specialPowers();
        m4.specialPowers();
        m5.specialPowers();
    }
}
