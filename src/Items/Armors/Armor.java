package Items.Armors;

public class Armor {
    private int damageBlock;
    private int price;
    private int id;
    private String name;

    public Armor(int id, String name,int damageBlock, int price ) {
        this.damageBlock = damageBlock;
        this.price = price;
        this.id = id;
        this.name = name;
    }
    public Armor (){}
    public int getDamageBlock() {
        return damageBlock;
    }

    public void setDamageBlock(int damageBlock) {
        this.damageBlock = damageBlock;
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
