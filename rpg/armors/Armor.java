// Armor.java
package armors;

public class Armor {
    // Atributos
    private String name;
    private String description;
    private int price;

    // Constructor
    public Armor(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Métodos (incluyendo el método getName)
    public String getName() {
        return name;
    }

    // Otros métodos si es necesario
}
