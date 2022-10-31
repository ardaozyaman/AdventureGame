package BattleLocations;

import Monsters.Monster;

public class BattleLocation {
    private int locId;
    private String locName;
    private int monstersCount;
    private int itemDrop;
    private int coinDrop;
    private Monster monster;

    public BattleLocation(String locName,int locId,int monstersCount, int itemDropId, int coinDrop, Monster monster) {
        this.locName = locName;
        this.locId = locId;
        this.monstersCount = monstersCount;
        this.itemDrop = itemDropId;
        this.coinDrop = coinDrop;
        this.monster = monster;
    }

    public int getLocId() {
        return locId;
    }

    public void setLocId(int locId) {
        this.locId = locId;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public int getMonstersCount() {
        return monstersCount;
    }

    public void setMonstersCount(int monstersCount) {
        this.monstersCount = monstersCount;
    }

    public int getItemDrop() {
        return itemDrop;
    }

    public void setItemDrop(int itemDrop) {
        this.itemDrop = itemDrop;
    }

    public int getCoinDrop() {
        return coinDrop;
    }

    public void setCoinDrop(int coinDrop) {
        this.coinDrop = coinDrop;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
