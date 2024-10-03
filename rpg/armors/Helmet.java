// Helmet.java
package armors;

public class Helmet extends Armor {
    private int bonusDefense;

    public Helmet(String name, String description, int price, int bonusDefense) {
        super(name, description, price);
        this.bonusDefense = bonusDefense;
    }

    public int getBonusDefense() {
        return bonusDefense;
    }
}

