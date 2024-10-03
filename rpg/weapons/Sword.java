/// Sword.java
package weapons;

public class Sword extends Weapon {
    private int bonusDamage;
    private int price;

    public Sword(String name, String description, int price, int bonusDamage) {
        super(name, description, price);
        this.bonusDamage = bonusDamage;
        this.price = price;
    }

    public int getBonusDamage() {
        return bonusDamage;
    }
            public int getprice() {return price;
        }
}
