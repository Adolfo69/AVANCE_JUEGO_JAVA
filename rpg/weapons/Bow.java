// Bow.java
package weapons;

public class Bow extends Weapon {
    private int bonusAccuracy;

    public Bow(String name, String description, int price, int bonusAccuracy) {
        super(name, description, price);
        this.bonusAccuracy = bonusAccuracy;
    }

    public int getBonusAccuracy() {
        return bonusAccuracy;
    }
}
