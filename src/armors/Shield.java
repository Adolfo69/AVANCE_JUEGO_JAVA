// Shield.java
package armors;

public class Shield extends Armor {
    private int bonusBlock;

    public Shield(String name, String description, int price, int bonusBlock) {
        super(name, description, price);
        this.bonusBlock = bonusBlock;
    }

    public int getBonusBlock() {
        return bonusBlock;
    }
}
