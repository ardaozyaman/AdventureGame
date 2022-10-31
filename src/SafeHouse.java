import BattleLocations.Cave;
import BattleLocations.Mount;
import BattleLocations.River;
import Items.Armors.Armor;
import Items.Weapons.Weapon;
import Players.Inventory;
import Players.Player;

import java.util.Scanner;


public class SafeHouse {
    static final int locId =1;
    private Scanner input = new Scanner(System.in);

    public void menu(Player player) {
        Tables.MainMenu();
        System.out.println("Gitmek istediğiniz yolu seçin :");
        int locId = input.nextInt();
        player.setOnLocId(locId);
        switch (locId){
            case 1:
                inSafeHouse(player);
                break;
            case 2:
                adventure(player);
                break;
            default:
                System.out.println("Geçerli bir yer seçiniz !!!");
                locId = input.nextInt();
                menu(player);
        }

        menu(player);

    }
    public void adventure(Player player){
        Tables.mapTable();
        System.out.println("Gitmek istediğiniz yolu seçin :");
        int locId = input.nextInt();
        switch (locId){
            case 0:
                menu(player);
                break;
            case 2:
                Battle battle= new Battle(player,new Cave());
                battle.battleStart(player,battle.getBattleLoc());
                break;
            case 3:
                Battle battle1 = new Battle(player,new Mount());
                battle1.battleStart(player,battle1.getBattleLoc());
                break;
            case 4:
                Battle battle2 = new Battle(player,new River());
                battle2.battleStart(player,battle2.getBattleLoc());
                break;
            default:
                System.out.println("Geçerli bir yer seçiniz !!!");
                locId = input.nextInt();

        }
        adventure(player);

    }
    public void inSafeHouse(Player player){
        Heal(player);
        System.out.println("1\tMarket\n2\tAna Menü");
        int select = input.nextInt();

        switch (select){
            case 1:
                Market(player);
                break;
            case 2:
                menu(player);
                break;
            default:
                System.out.println("Geçerli bir yer seçiniz !!!");
                select = input.nextInt();
                inSafeHouse(player);
        }
    inSafeHouse(player);
    }
    public void Heal(Player player){
        if(player.getHealth()==player.getPlayerChar().getHealth()){

        }else{
            player.setHealth(player.getPlayerChar().getHealth());
            System.out.println(player.getName()+"\tCanın yenilendi \n Mevcut canın : "+player.getHealth()+" HP");
        }
    }
    public void Market(Player player){
        System.out.println("1\tZırhlar\n2\tSilahlar\n3\tEnvanteri göster\n0\tÇıkış");
        int select = input.nextInt();
        int selectId;

        switch (select){
            case 0:
                inSafeHouse(player);
                break;
            case 1:
              Tables.ArmorTable();
                System.out.println("Satın almak istediniz eşyayı tuşlayın\n0\tÇıkış");
                selectId = input.nextInt();
                if (selectId==0){
                }else {
                    economy(player, Game.armorIdSelect(selectId));
                }
                break;
            case 2:
                Tables.WeaponTable();
                System.out.println("Satın almak istediniz eşyayı tuşlayın\n0\tÇıkış");
                selectId = input.nextInt();
                if (selectId==0){
                }else{
                    economy(player,Game.weaponIdSelect(selectId));
                }
                break;
            case 3:
                Tables.showInventory(player);
                System.out.println("çıkış için tuşlayınız");
                input.next();
                break;
            default:
                System.out.println("Geçerli bir seçim yapın !!!");
                select = input.nextInt();
                Market(player);
        }
        Market(player);

    }
    public void economy(Player player, Armor armor){
        if(player.getCoin() >= armor.getPrice()){
            player.setCoin(player.getCoin()- armor.getPrice());
            player.getPlayerInventory().setPlayerArmor(armor);
        }
        else{
            System.out.println("Yetersiz coin ezik !!");
            Market(player);
        }
    }
    public  void economy(Player player, Weapon weapon){
        if(player.getCoin() >= weapon.getPrice()){
            player.setCoin(player.getCoin()- weapon.getPrice());
            player.getPlayerInventory().setPlayerWeapon(weapon);
        }
        else{
            System.out.println("Yetersiz coin ezik !!");
            Market(player);
        }
    }


    public int getLocId() {
        return locId;
    }


}
