package Monster;

public abstract class Monster {

    public Monster(String name) {
        this.name = name;}

    //Setter and Getter
    public String getName() {
        return name;}

    //Constructor
    public void setName(String name) {
        this.name = name;}

    private String name;

    public abstract void specialPowers();
}
