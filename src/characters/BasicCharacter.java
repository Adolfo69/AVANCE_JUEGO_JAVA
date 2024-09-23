// BasicCharacter.java
package characters;

public class BasicCharacter {
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int mp;
    protected int maxMp;

    public BasicCharacter(String name, int hp, int maxHp, int mp, int maxMp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.mp = mp;
        this.maxMp = maxMp;
    }

    public void displayData() {
        System.out.println("Character: " + name);
        System.out.println("HP: " + hp + "/" + maxHp);
        System.out.println("MP: " + mp + "/" + maxMp);
    }

    // Método para modificar la vida
    public void modifyHP(int amount) {
        // Puedes ajustar la lógica según tus necesidades
        hp += amount;
        if (hp < 100) {
            hp = 0;
        } else if (hp > maxHp) {
            hp = maxHp;
        }
    }
}
