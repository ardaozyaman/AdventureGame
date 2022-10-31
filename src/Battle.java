import BattleLocations.BattleLocation;
import Players.Player;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Battle {
    private Player player;
    private BattleLocation battleLoc;
    private Scanner input = new Scanner(System.in);
    public Battle(Player player, BattleLocation battleLoc) {
        this.player = player;
        this.battleLoc = battleLoc;
    }
    public void battleStart(Player player,BattleLocation battleLoc) {
        System.out.println(battleLoc.getLocName()+" 'da "+battleLoc.getMonstersCount()+" "+battleLoc.getMonster().getName()+" ile karşılaştın savaş KAÇINILMAZ !!! ");
        for (int i =1 ;i<4;++i){

            System.out.println("\n.\n"+i);
        }
        System.out.println("Başla !!!");
        onBattle(player,battleLoc);
    }
    public void onBattle(Player player,BattleLocation battleLoc){
        int monsterHp= battleLoc.getMonster().getHealth();
        int monsterCount= battleLoc.getMonstersCount();
        for (int monsterCnt = monsterCount ; monsterCnt>0;--monsterCnt){
            for (int monsterhp = monsterHp; monsterhp>0;monsterhp-=(player.getDamage()+player.getPlayerInventory().getPlayerWeapon().getDamage())){
                System.out.println("Saldırmak için bir tuşa bas!!!");
                input.nextInt();
                player.setHealth(player.getHealth()-(battleLoc.getMonster().getDamage()-player.getPlayerInventory().getPlayerArmor().getDamageBlock()));
                System.out.println(battleLoc.getMonster().getName()+" sana "+battleLoc.getMonster().getDamage()+" Vurdu !! "+player.getPlayerInventory().getPlayerArmor().getName()+" Zırhın "+ player.getPlayerInventory().getPlayerArmor().getDamageBlock()+" Kadarını engelledi");
                System.out.println(player.getName()+" "+battleLoc.getMonster().getName()+"'a "+(player.getDamage()+player.getPlayerInventory().getPlayerWeapon().getDamage())+" Vurdu !!");
                System.out.println("Senin Canın : "+player.getHealth()+"\n"+battleLoc.getMonster().getName()+"Canı :"+(monsterhp-(player.getDamage()+player.getPlayerInventory().getPlayerWeapon().getDamage())));

            }
            System.out.println(battleLoc.getMonster().getName()+monsterCnt+"\tÖLDÜ");
        }
        System.out.println(battleLoc.getLocName()+" Bölgesini temizledin ve bir İtem Kazandın envanterini kontrol et !!");
        player.getPlayerInventory().winCondition(battleLoc.getItemDrop());

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public BattleLocation getBattleLoc() {
        return battleLoc;
    }

    public void setBattleLoc(BattleLocation battleLoc) {
        this.battleLoc = battleLoc;
    }
}
