import characters.Player;
import armors.Helmet;
import armors.Shield;
import weapons.Sword;

public class Main {
    public static void main(String[] args) {
        // Crear un jugador
        Player player = new Player("Aventurero");

        // Crear una armadura (casco)
        Helmet helmet = new Helmet("Casco de Hierro", "Protección para la cabeza", 50, 5);

        // Crear un escudo
        Shield shield = new Shield("Escudo de Madera", "Escudo básico", 30, 3);

        // Crear un arma
        Sword sword = new Sword("Espada Corta", "Arma básica de cuerpo a cuerpo", 40, 8);

        // Asignar la armadura y el arma al jugador
        player.setArmor(helmet);
        player.setWeapon(sword);

        // Mostrar los datos del jugador
        player.displayData();
    }
}
