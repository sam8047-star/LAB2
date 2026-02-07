package Monster;

import javax.lang.model.element.Name;
import javax.xml.namespace.QName;

public class Main {

    //Class Variables
    public String name;
    public String size;
    public String description;
    public String superpower;

    public String getName() {return name;}
    public void setName(String _name) {this.name = name;}

    public String getSize() {return size;}
    public void setSize(String size) {this.size = size;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public static void main(String[] args)

    {

        Monster m1 = new Zombie ("Zombie");
        Monster m2 = new Dragon ("Dragon");
        Monster m3 = new Alien("Alien");
        Monster m4 = new Fire("Fire Monster");


        System.out.println("Monster 1 " + m1.getName());
        System.out.println("Monster 2 " + m2.getName());
        System.out.println("Monster 3 " + m3.getName());
        System.out.println("Monster 4 " + m4.getName());

    }
}