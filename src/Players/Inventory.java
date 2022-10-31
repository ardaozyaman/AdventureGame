package Players;

import Items.Armors.Armor;
import Items.Armors.Average;
import Items.Armors.Epic;
import Items.Armors.Poor;
import Items.Weapons.Weapon;

public abstract class Inventory {
    private boolean water;
    private boolean food;
    private boolean wood;
    private int armorId;
    private int weaponId;
    private Armor playerArmor;
    private Weapon playerWeapon;



    public Armor getPlayerArmor() {
        if(playerArmor==null){
            playerArmor= new Armor(0,"Mevcut değil",0,0);
        }
        return playerArmor;
    }

    public void setPlayerArmor(Armor playerArmor) {

        this.playerArmor = playerArmor;
    }

    public Weapon getPlayerWeapon() {
        if (playerWeapon== null){
            playerWeapon = new Weapon(0,"Mevcut değil",0,0);
        }
        return playerWeapon;
    }

    public void setPlayerWeapon(Weapon playerWeapon) {
        this.playerWeapon = playerWeapon;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public int getArmorId() {
        return armorId;
    }

    public void setArmorId(int armorId) {
        Armor[] armors = {new Poor(),new Average(),new Epic()};
        for (Armor armor:armors) {
            if(armorId == armor.getId()){
                setPlayerArmor(armor);
            }
        }
        this.armorId = armorId;
    }

    public int getWeaponId() {

        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        Weapon[] weapons = {new Items.Weapons.Poor(),new Items.Weapons.Average(),new Items.Weapons.Epic()};
        for (Weapon weapon:weapons) {
            if (weaponId == weapon.getId()){
                setPlayerWeapon(weapon);
            }

        }
        this.weaponId = weaponId;
    }

    public void winCondition(int item){
        switch (item){
            case 1:
                setFood(true);
                break;
            case 2:
                setWater(true);
                break;
            case 3:
                setWood(true);
            break;
        }
        if (isFood()&&isWater()&&isWood()){
            System.out.println("TEBRİKLER KAZANDIN !!!!");
            System.exit(0);
        }
    }
}
