// Weapon.java
package weapons;

public class Weapon {
    protected String name;
    protected String description;
    protected int price;

    public Weapon(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
