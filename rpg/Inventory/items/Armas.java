package rpg.Inventory.items;

import enums.ItemType;

public class Armas extends rpg.Inventory.items.Item {
    private String daño;

    /**
     * Constructor de la clase armas
     */
    public Armas(String nombre, String descripcion, String daño){
        super(nombre, ItemType.WEAPON);
        this.daño = daño;
    }

    public String getDaño(){
        return daño;
    }
    public String toString(){
        return  getNombre() + "Daño: " + daño;
    }
}
