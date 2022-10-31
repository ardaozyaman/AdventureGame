package Players;

import Chars.*;

public class Player {

    private int damage;
    private int armor;
    private int health;
    private int coin;
    private int charId;
    private String name;
    private int onLocId;
    private GameChar playerChar;
    private Inventory playerInventory = new Inventory() {};

    public Player() {
    }

    public void setCharId(int charId) {
        GameChar[] charArray = {new Samurai(), new Archer(), new Knight(),new ZARGANAEFE()};
        for (GameChar gameChar : charArray) {
            if (gameChar.getId() == charId) {
                setPlayerChar(gameChar);
                setCoin(gameChar.getCoin());
                setDamage(gameChar.getDamage());
                setHealth(gameChar.getHealth());
            }
        }
        this.charId = charId;
    }

    public Inventory getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(Inventory playerInventory) {
        setArmor(playerInventory.getPlayerArmor().getDamageBlock());
        setDamage(getDamage()+playerInventory.getPlayerWeapon().getDamage());
        this.playerInventory = playerInventory;
    }

    public GameChar getPlayerChar() {

        return playerChar;
    }

    public int getCharId() {
        return charId;
    }

    public void setPlayerChar(GameChar playerChar) {
        this.playerChar = playerChar;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health<=0){
            System.out.println("ÖLDÜN EZİK !!!");
            System.exit(0);
        }
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOnLocId() {
        return onLocId;
    }

    public void setOnLocId(int onLocId) {

        this.onLocId = onLocId;

    }

}
