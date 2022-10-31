
import Items.Armors.Armor;
import Items.Armors.Average;
import Items.Armors.Epic;
import Items.Armors.Poor;
import Items.Weapons.Weapon;
import Players.Player;

import java.util.Scanner;

public class Game {
    private final Scanner input = new Scanner(System.in);
    private Player player = new Player();
    private SafeHouse safeHouse = new SafeHouse();
    public void start() {

        System.out.println("Macera oyununa hoşgeldiniz ! ");
        System.out.println("Lütfen bir isim giriniz :");
        String playerName = input.nextLine();
        player.setName(playerName);
        System.out.println(player.getName() + " Lütfen Secmek istediğiniz char ın idsini tuşlayın : ");
        Tables.CharTable();
        int charId = input.nextInt();
        player.setCharId(charId);
        System.out.println(player.getPlayerChar().getName() + " Seçtiniz");
        safeHouse.menu(player);



    }




    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    public static Armor armorIdSelect(int armorId){
        Armor[] armors = {new Poor(),new Average(),new Epic()};
        Armor armor1= new Armor();
        for (Armor armor:armors) {
            if(armorId == armor.getId()){
                armor1=armor;
            }
        }
        return armor1;
    }
    public static Weapon weaponIdSelect(int weaponId){
        Weapon[] weapons = {new Items.Weapons.Poor(),new Items.Weapons.Average(),new Items.Weapons.Epic()};
        Weapon weapon1= new Weapon();
        for (Weapon weapon:weapons) {
            if(weaponId == weapon.getId()){
                weapon1=weapon;
            }
        }
        return weapon1;
    }
}
