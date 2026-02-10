package Monster;

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


        System.out.println("Monster #1:");
        System.out.println("Name: " + m1.getName());
        System.out.println("health: " + m1.getHealth());
        System.out.println("Attack Power: " + m1.getAttackPower());
        System.out.println("Special Power: " + m1.getSpecialPower());

        System.out.println();

        System.out.println("Monster #2:");
        System.out.println("Name: " + m2.getName());
        System.out.println("health: " + m2.getHealth());
        System.out.println("Attack Power: " + m2.getAttackPower());
        System.out.println("Special Power: " + m2.getSpecialPower());

        System.out.println();

        System.out.println("Monster #3:");
        System.out.println("Name: " + m3.getName());
        System.out.println("health: " + m3.getHealth());
        System.out.println("Attack Power: " + m3.getAttackPower());
        System.out.println("Special Power: " + m3.getSpecialPower());

        System.out.println();

        System.out.println("Monster #4:");
        System.out.println("Name: " + m4.getName());
        System.out.println("health: " + m4.getHealth());
        System.out.println("Attack Power: " + m4.getAttackPower());
        System.out.println("Special Power: " + m4.getSpecialPower());

        System.out.println();

        System.out.println("Monster #5:");
        System.out.println("Name: " + m5.getName());
        System.out.println("health: " + m5.getHealth());
        System.out.println("Attack Power: " + m5.getAttackPower());
        System.out.println("Special Power: " + m5.getSpecialPower());

        System.out.println();

        System.out.println("\nSpecial Powers:");
        m1.specialPowers();
        m2.specialPowers();
        m3.specialPowers();
        m4.specialPowers();
        m5.specialPowers();
    }
}