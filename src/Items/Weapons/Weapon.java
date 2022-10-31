package Items.Weapons;

public class Weapon {
    private int damage;
    private int price;
    private int id;
    private String name;

    public Weapon( int id, String name,int damage, int price) {
        this.damage = damage;
        this.price = price;
        this.id = id;
        this.name = name;
    }
    public Weapon(){}

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
