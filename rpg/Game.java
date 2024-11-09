package rpg;

import rpg.Inventory.Inventory;
import rpg.entities.Player;
import rpg.entities.enemy.Enemy;
import rpg.entities.enemy.goblins.RookieGoblin;
import rpg.entities.enemy.slimes.BasicSlime;
import gui.GUIForm;


import java.util.Random;


public class Game {

    private Player player;
    private Enemy enemy;
    private Inventory inventory;

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
        new GUIForm();
    }

    public Game() {
        this.player = new Player("Odin");
        int enemyType = new Random().nextInt(3) + 1;
        this.enemy = switch (enemyType) {
            case 1 -> new RookieGoblin();
            case 2 -> new BasicSlime("Basic Slime");
            default -> new Enemy("Otro enemigo");
        };
        this.inventory = new Inventory();
    }

    public void startGame() {
        manageGame();
        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (enemy.isAlive()) {
                enemy.attack(player);
            }
        }

        if (player.isAlive()) {
            System.out.println(player.getName() + " GANO el mas perro");
        } else {
            System.out.println(enemy.getName() + " Ganooooo ");
        }
    }

    public void manageGame(){
        rpg.Inventory.items.Espada espada = new rpg.Inventory.items.Espada(" Acero ",58);
        rpg.Inventory.items.arco arco = new rpg.Inventory.items.arco();
        rpg.Inventory.items.hacha hacha = new rpg.Inventory.items.hacha();
        rpg.Inventory.items.Antidoto antidoto = new rpg.Inventory.items.Antidoto();
        rpg.Inventory.items.Armadura armadura = new rpg.Inventory.items.Armadura(" Armadura de cuero ",35);
        rpg.Inventory.items.armaduradediamante armaduraDiamante = new rpg.Inventory.items.armaduradediamante();
        rpg.Inventory.items.blindaje blindaje = new rpg.Inventory.items.blindaje();
        rpg.Inventory.items.casco casco = new rpg.Inventory.items.casco();
        rpg.Inventory.items.escudo escudo = new rpg.Inventory.items.escudo();
        rpg.Inventory.items.lanza lanza = new rpg.Inventory.items.lanza();
        rpg.Inventory.items.Llave llave = new rpg.Inventory.items.Llave();
        rpg.Inventory.items.machete machete = new rpg.Inventory.items.machete();
        rpg.Inventory.items.Mapa mapa = new rpg.Inventory.items.Mapa();
        rpg.Inventory.items.Monedas monedas = new rpg.Inventory.items.Monedas();
        rpg.Inventory.items.Pocion pocion = new rpg.Inventory.items.Pocion();


        // Agregar ítems al inventario
        inventory.addItem(espada);
        inventory.addItem(arco);
        inventory.addItem(hacha);
        inventory.addItem(antidoto);
        inventory.addItem(armadura);
        inventory.addItem(armaduraDiamante);
        inventory.addItem(blindaje);
        inventory.addItem(casco);
        inventory.addItem(escudo);
        inventory.addItem(lanza);
        inventory.addItem(llave);
        inventory.addItem(machete);
        inventory.addItem(mapa);
        inventory.addItem(monedas);
        inventory.addItem(pocion);


        /**
         *      Imprimir el inventario
         */
        System.out.println("Items en el inventario:");
        inventory.printItems();
    }
}