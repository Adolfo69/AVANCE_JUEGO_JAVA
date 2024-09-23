// Player.java
package characters;

import armors.Armor;
import weapons.Weapon;

import java.util.Random;

public class Player extends BasicCharacter {
    private Weapon weapon;
    private Armor armor;
    private int str;
    private int def;
    private int dex;
    private int intel;
    private int level;
    private int exp;

    public Player(String name) {
        super(name, 100, 100, 50, 50); // Valores iniciales para hp, maxHp, mp, maxMp
        this.level = 1;
        this.exp = 0;
        this.weapon = null; // or assign a basic weapon
        this.armor = null;  // or assign a basic armor
        distributeAttributePoints();
    }

    private void distributeAttributePoints() {
        int totalPoints = 30;
        Random random = new Random();

        // Distribute points randomly among attributes
        this.str = random.nextInt(totalPoints + 1);
        totalPoints -= this.str;

        this.def = random.nextInt(totalPoints + 1);
        totalPoints -= this.def;

        this.dex = random.nextInt(totalPoints + 1);
        totalPoints -= this.dex;

        this.intel = totalPoints;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Weapon: " + (weapon != null ? weapon.getName() : "None"));
        System.out.println("Armor: " + (armor != null ? armor.getName() : "None"));
        System.out.println("Strength: " + str);
        System.out.println("Defense: " + def);
        System.out.println("Dexterity: " + dex);
        System.out.println("Intelligence: " + intel);
        System.out.println("Level: " + level);
        System.out.println("Experience: " + exp);
        System.out.println("This object is a Player.");
    }

    // Agregar método para modificar la vida
    public void modifyHP(int amount) {
        // Puedes ajustar la lógica según tus necesidades
        super.modifyHP(amount);
    }

    // Agregar método para modificar la energía mágica
    public void modifyMP(int amount) {
        // Puedes ajustar la lógica según tus necesidades
        mp += amount;
        if (mp < 0) {
            mp = 0;
        } else if (mp > maxMp) {
            mp = maxMp;
        }
    }

    // Agregar método para asignar un arma
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Agregar método para asignar una armadura
    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
