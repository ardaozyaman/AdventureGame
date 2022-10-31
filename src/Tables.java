import Chars.*;
import Items.Armors.Armor;
import Items.Weapons.Average;
import Items.Weapons.Epic;
import Items.Weapons.Poor;
import Items.Weapons.Weapon;
import BattleLocations.Cave;
import BattleLocations.BattleLocation;
import BattleLocations.Mount;
import BattleLocations.River;
import Monsters.Monster;
import Players.Player;

public class Tables {
    public static void MainMenu(){
        System.out.println("1\tEve git\n2\tMaceraya çık");

    }
    public static void CharTable() {
        GameChar[] gameChars = {new Samurai(), new Archer(), new Knight(),new ZARGANAEFE()};
        System.out.println("              " + "ID" + "\t" + " " + "\t" + "Coin" + "\t" + "Damage" + "\t" + "Health");
        for (GameChar gameChar : gameChars) {
            System.out.println("Karakterler  :" + gameChar.getId() + " " + gameChar.getName() + "\t" + gameChar.getCoin() + "\t" + "\t" + gameChar.getDamage() + "\t" + "\t" + gameChar.getHealth());
        }
    }

    public static void WeaponTable() {
        Weapon[] weapons = {new Poor(), new Average(), new Epic()};
        System.out.println("\t\t" + "ID" + "\t" + "\t\t\t" + "Damage" + "\t" + "Price");
        for (Weapon weapon : weapons) {
            System.out.println("Silah : " + weapon.getId() + "\t" + weapon.getName() + "\t\t" + weapon.getDamage() + "\t\t" + weapon.getPrice());
        }
    }

    public static void ArmorTable() {
        Armor[] armors = {new Items.Armors.Poor(), new Items.Armors.Average(), new Items.Armors.Epic()};
        System.out.println("\t\t" + "ID" + "\t" + "\t\t\t" + "Armor" + "\t" + "Price");
        for (Armor armor : armors) {
            System.out.println("Zırh  : " + armor.getId() + "\t" + armor.getName() + "\t" + "\t" + armor.getDamageBlock() + "\t" + "\t" + armor.getPrice());
        }
    }

    public static void mapTable() {
        BattleLocation[] locations = {new Cave(), new Mount(), new River()};
        for (BattleLocation location : locations) {
            System.out.println(location.getLocId()+"\t"+location.getLocName());
        }
    }
    public static void showInventory(Player player){
        System.out.println("\nCoin : "+player.getCoin()+"\tSağlık : "+player.getHealth()+"\n");
        System.out.println("Envanterin :\n"+"Zırh :\t"+player.getPlayerInventory().getPlayerArmor().getName());
        System.out.println("Silah :\t"+player.getPlayerInventory().getPlayerWeapon().getName());
        String su = player.getPlayerInventory().isWater() ? "Su elde edildi": "Elde edilmemiş" ;
        String odun = player.getPlayerInventory().isWood() ? "Odun elde edildi": "Elde edilmemiş" ;
        String yemek = player.getPlayerInventory().isFood() ? "Yemek elde edildi": "Elde edilmemiş" ;
        System.out.println("Su :\t"+su);
        System.out.println("Odun :\t"+odun);
        System.out.println("Food :\t"+yemek);
    }
    public static void enemy(BattleLocation battleLoc){

    }
}